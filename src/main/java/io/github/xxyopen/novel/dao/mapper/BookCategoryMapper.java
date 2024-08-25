package io.github.xxyopen.novel.dao.mapper;

import io.github.xxyopen.novel.dao.entity.BookCategory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 小说类别 Mapper 接口
 * </p>
 *
 * @author xiongxiaoyang
 * @date 2022/05/12
 */
@Mapper
@Repository
public interface BookCategoryMapper extends BaseMapper<BookCategory> {

}
