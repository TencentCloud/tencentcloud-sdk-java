package com.tencentcloudapi.cws.v20180312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DeleteSitesRequest  extends AbstractModel{


    /**
    * 站点ID列表
    */
    @SerializedName("SiteIds")
    @Expose
    private Integer [] SiteIds;
    

    /**
     * 获取站点ID列表
     * @return SiteIds 站点ID列表
     */
    public Integer [] getSiteIds() {
        return this.SiteIds;
    }

    /**
     * 设置站点ID列表
     * @param SiteIds 站点ID列表
     */
    public void setSiteIds(Integer [] SiteIds) {
        this.SiteIds = SiteIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SiteIds.", this.SiteIds);

    }
}

