package io.github.xxyopen.novel.dao.mapper;

import io.github.xxyopen.novel.dao.entity.HomeBook;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 小说推荐 Mapper 接口
 * </p>
 *
 * @author xiongxiaoyang
 * @date 2022/05/12
 */
@Mapper
@Repository
public interface HomeBookMapper extends BaseMapper<HomeBook> {

}
