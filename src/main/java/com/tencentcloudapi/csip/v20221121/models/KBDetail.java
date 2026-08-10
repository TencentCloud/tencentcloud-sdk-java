/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KBDetail extends AbstractModel {

    /**
    * <p>KB 补丁内部 ID（kb_info.id）</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>KB 编号<br>参数格式：形如 KB5001234</p>
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * <p>KB 补丁名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>参考链接（微软官方文档地址）</p>
    */
    @SerializedName("ReferUrl")
    @Expose
    private String ReferUrl;

    /**
    * <p>发布时间<br>参数格式：YYYY-MM-DD HH:mm:ss</p>
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * <p>安装该 KB 后是否需要重启<br>枚举值：<br>true：需要<br>false：不需要</p>
    */
    @SerializedName("NeedRestart")
    @Expose
    private Boolean NeedRestart;

    /**
    * <p>关联漏洞列表</p>
    */
    @SerializedName("RelateVulList")
    @Expose
    private VulBriefInfo [] RelateVulList;

    /**
    * <p>关联漏洞总数</p>
    */
    @SerializedName("RelateVulCount")
    @Expose
    private Long RelateVulCount;

    /**
    * <p>关联os版本</p>
    */
    @SerializedName("RelateProduct")
    @Expose
    private String RelateProduct;

    /**
     * Get <p>KB 补丁内部 ID（kb_info.id）</p> 
     * @return ID <p>KB 补丁内部 ID（kb_info.id）</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>KB 补丁内部 ID（kb_info.id）</p>
     * @param ID <p>KB 补丁内部 ID（kb_info.id）</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>KB 编号<br>参数格式：形如 KB5001234</p> 
     * @return Number <p>KB 编号<br>参数格式：形如 KB5001234</p>
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set <p>KB 编号<br>参数格式：形如 KB5001234</p>
     * @param Number <p>KB 编号<br>参数格式：形如 KB5001234</p>
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get <p>KB 补丁名称</p> 
     * @return Name <p>KB 补丁名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>KB 补丁名称</p>
     * @param Name <p>KB 补丁名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>参考链接（微软官方文档地址）</p> 
     * @return ReferUrl <p>参考链接（微软官方文档地址）</p>
     */
    public String getReferUrl() {
        return this.ReferUrl;
    }

    /**
     * Set <p>参考链接（微软官方文档地址）</p>
     * @param ReferUrl <p>参考链接（微软官方文档地址）</p>
     */
    public void setReferUrl(String ReferUrl) {
        this.ReferUrl = ReferUrl;
    }

    /**
     * Get <p>发布时间<br>参数格式：YYYY-MM-DD HH:mm:ss</p> 
     * @return PublishTime <p>发布时间<br>参数格式：YYYY-MM-DD HH:mm:ss</p>
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set <p>发布时间<br>参数格式：YYYY-MM-DD HH:mm:ss</p>
     * @param PublishTime <p>发布时间<br>参数格式：YYYY-MM-DD HH:mm:ss</p>
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Get <p>安装该 KB 后是否需要重启<br>枚举值：<br>true：需要<br>false：不需要</p> 
     * @return NeedRestart <p>安装该 KB 后是否需要重启<br>枚举值：<br>true：需要<br>false：不需要</p>
     */
    public Boolean getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set <p>安装该 KB 后是否需要重启<br>枚举值：<br>true：需要<br>false：不需要</p>
     * @param NeedRestart <p>安装该 KB 后是否需要重启<br>枚举值：<br>true：需要<br>false：不需要</p>
     */
    public void setNeedRestart(Boolean NeedRestart) {
        this.NeedRestart = NeedRestart;
    }

    /**
     * Get <p>关联漏洞列表</p> 
     * @return RelateVulList <p>关联漏洞列表</p>
     */
    public VulBriefInfo [] getRelateVulList() {
        return this.RelateVulList;
    }

    /**
     * Set <p>关联漏洞列表</p>
     * @param RelateVulList <p>关联漏洞列表</p>
     */
    public void setRelateVulList(VulBriefInfo [] RelateVulList) {
        this.RelateVulList = RelateVulList;
    }

    /**
     * Get <p>关联漏洞总数</p> 
     * @return RelateVulCount <p>关联漏洞总数</p>
     */
    public Long getRelateVulCount() {
        return this.RelateVulCount;
    }

    /**
     * Set <p>关联漏洞总数</p>
     * @param RelateVulCount <p>关联漏洞总数</p>
     */
    public void setRelateVulCount(Long RelateVulCount) {
        this.RelateVulCount = RelateVulCount;
    }

    /**
     * Get <p>关联os版本</p> 
     * @return RelateProduct <p>关联os版本</p>
     */
    public String getRelateProduct() {
        return this.RelateProduct;
    }

    /**
     * Set <p>关联os版本</p>
     * @param RelateProduct <p>关联os版本</p>
     */
    public void setRelateProduct(String RelateProduct) {
        this.RelateProduct = RelateProduct;
    }

    public KBDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KBDetail(KBDetail source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ReferUrl != null) {
            this.ReferUrl = new String(source.ReferUrl);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.NeedRestart != null) {
            this.NeedRestart = new Boolean(source.NeedRestart);
        }
        if (source.RelateVulList != null) {
            this.RelateVulList = new VulBriefInfo[source.RelateVulList.length];
            for (int i = 0; i < source.RelateVulList.length; i++) {
                this.RelateVulList[i] = new VulBriefInfo(source.RelateVulList[i]);
            }
        }
        if (source.RelateVulCount != null) {
            this.RelateVulCount = new Long(source.RelateVulCount);
        }
        if (source.RelateProduct != null) {
            this.RelateProduct = new String(source.RelateProduct);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ReferUrl", this.ReferUrl);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamSimple(map, prefix + "NeedRestart", this.NeedRestart);
        this.setParamArrayObj(map, prefix + "RelateVulList.", this.RelateVulList);
        this.setParamSimple(map, prefix + "RelateVulCount", this.RelateVulCount);
        this.setParamSimple(map, prefix + "RelateProduct", this.RelateProduct);

    }
}

