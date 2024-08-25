package io.github.xxyopen.novel.dao.mapper;

import io.github.xxyopen.novel.dao.entity.AuthorInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 作者信息 Mapper 接口
 * </p>
 *
 * @author xiongxiaoyang
 * @date 2022/05/11
 */
@Mapper
@Repository
public interface AuthorInfoMapper extends BaseMapper<AuthorInfo> {

}
