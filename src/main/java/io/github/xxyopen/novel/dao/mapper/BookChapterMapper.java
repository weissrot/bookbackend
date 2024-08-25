package io.github.xxyopen.novel.dao.mapper;

import io.github.xxyopen.novel.dao.entity.BookChapter;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 小说章节 Mapper 接口
 * </p>
 *
 * @author xiongxiaoyang
 * @date 2022/05/11
 */

@Mapper
@Repository
public interface BookChapterMapper extends BaseMapper<BookChapter> {

}
