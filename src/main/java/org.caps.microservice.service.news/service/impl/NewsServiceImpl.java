package org.caps.microservice.service.news.service.impl;

import org.caps.microservice.common.domain.TbNews;
import org.caps.microservice.common.service.impl.BaseServiceImpl;
import org.caps.microservice.service.news.mapper.TbNewsMapper;
import org.caps.microservice.service.news.service.NewsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class NewsServiceImpl extends BaseServiceImpl<TbNews, TbNewsMapper> implements NewsService{
}
