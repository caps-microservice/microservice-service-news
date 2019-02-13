package org.caps.microservice.service.news.controller;

import org.caps.microservice.common.domain.TbNews;
import org.caps.microservice.common.dto.BaseResult;
import org.caps.microservice.service.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NewsController {

    @Autowired
    private NewsService newsService;

    /**
     * 根据 ID 获取文章
     *
     * @param postGuid
     * @return
     */
    @RequestMapping(value = "{newsId}", method = RequestMethod.GET)
    @ResponseBody
    public BaseResult get(
            @PathVariable(value = "newsId") String postGuid) {
        TbNews tbPostsPost=new TbNews();
        tbPostsPost.setId(Integer.parseInt(postGuid));
        TbNews tbNews = newsService.selectOne(tbPostsPost);
        return BaseResult.success("ok",tbNews);
    }
}
