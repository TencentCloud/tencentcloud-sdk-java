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

public class DescribeSkillScanAlertListRequest extends AbstractModel {

    /**
    * 分页偏移量
取值范围：[0, +∞)
默认值：0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页返回数量
取值范围：[1, 200]
默认值：10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件列表，支持的过滤字段：BelongAssetType（归属资产类型 HOST/CONTAINER，未指定默认 HOST）、ContainerId（容器 ID，仅容器告警生效）、RiskLevel（风险等级，精确匹配）、Status（处理状态，精确匹配）、SkillName（Skill 名称，模糊匹配）、UUID（主机 UUID，精确匹配）、Level（告警级别，精确匹配）、ContentHash（文件 SHA256，精确匹配）、InstanceID（实例 ID，精确匹配）、InstanceName（实例名称，模糊匹配）、SkillPath（Skill 路径，模糊匹配）
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * 排序方式
枚举值：
ASC：升序
DESC：降序
默认值：DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段
枚举值：
CreateTime：首次检出时间
SecurityScore：安全评分
UpdateTime：更新时间
默认值：CreateTime
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 集团账号的成员 id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get 分页偏移量
取值范围：[0, +∞)
默认值：0 
     * @return Offset 分页偏移量
取值范围：[0, +∞)
默认值：0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
取值范围：[0, +∞)
默认值：0
     * @param Offset 分页偏移量
取值范围：[0, +∞)
默认值：0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页返回数量
取值范围：[1, 200]
默认值：10 
     * @return Limit 每页返回数量
取值范围：[1, 200]
默认值：10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页返回数量
取值范围：[1, 200]
默认值：10
     * @param Limit 每页返回数量
取值范围：[1, 200]
默认值：10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件列表，支持的过滤字段：BelongAssetType（归属资产类型 HOST/CONTAINER，未指定默认 HOST）、ContainerId（容器 ID，仅容器告警生效）、RiskLevel（风险等级，精确匹配）、Status（处理状态，精确匹配）、SkillName（Skill 名称，模糊匹配）、UUID（主机 UUID，精确匹配）、Level（告警级别，精确匹配）、ContentHash（文件 SHA256，精确匹配）、InstanceID（实例 ID，精确匹配）、InstanceName（实例名称，模糊匹配）、SkillPath（Skill 路径，模糊匹配） 
     * @return Filters 过滤条件列表，支持的过滤字段：BelongAssetType（归属资产类型 HOST/CONTAINER，未指定默认 HOST）、ContainerId（容器 ID，仅容器告警生效）、RiskLevel（风险等级，精确匹配）、Status（处理状态，精确匹配）、SkillName（Skill 名称，模糊匹配）、UUID（主机 UUID，精确匹配）、Level（告警级别，精确匹配）、ContentHash（文件 SHA256，精确匹配）、InstanceID（实例 ID，精确匹配）、InstanceName（实例名称，模糊匹配）、SkillPath（Skill 路径，模糊匹配）
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件列表，支持的过滤字段：BelongAssetType（归属资产类型 HOST/CONTAINER，未指定默认 HOST）、ContainerId（容器 ID，仅容器告警生效）、RiskLevel（风险等级，精确匹配）、Status（处理状态，精确匹配）、SkillName（Skill 名称，模糊匹配）、UUID（主机 UUID，精确匹配）、Level（告警级别，精确匹配）、ContentHash（文件 SHA256，精确匹配）、InstanceID（实例 ID，精确匹配）、InstanceName（实例名称，模糊匹配）、SkillPath（Skill 路径，模糊匹配）
     * @param Filters 过滤条件列表，支持的过滤字段：BelongAssetType（归属资产类型 HOST/CONTAINER，未指定默认 HOST）、ContainerId（容器 ID，仅容器告警生效）、RiskLevel（风险等级，精确匹配）、Status（处理状态，精确匹配）、SkillName（Skill 名称，模糊匹配）、UUID（主机 UUID，精确匹配）、Level（告警级别，精确匹配）、ContentHash（文件 SHA256，精确匹配）、InstanceID（实例 ID，精确匹配）、InstanceName（实例名称，模糊匹配）、SkillPath（Skill 路径，模糊匹配）
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序方式
枚举值：
ASC：升序
DESC：降序
默认值：DESC 
     * @return Order 排序方式
枚举值：
ASC：升序
DESC：降序
默认值：DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式
枚举值：
ASC：升序
DESC：降序
默认值：DESC
     * @param Order 排序方式
枚举值：
ASC：升序
DESC：降序
默认值：DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序字段
枚举值：
CreateTime：首次检出时间
SecurityScore：安全评分
UpdateTime：更新时间
默认值：CreateTime 
     * @return By 排序字段
枚举值：
CreateTime：首次检出时间
SecurityScore：安全评分
UpdateTime：更新时间
默认值：CreateTime
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段
枚举值：
CreateTime：首次检出时间
SecurityScore：安全评分
UpdateTime：更新时间
默认值：CreateTime
     * @param By 排序字段
枚举值：
CreateTime：首次检出时间
SecurityScore：安全评分
UpdateTime：更新时间
默认值：CreateTime
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 集团账号的成员 id 
     * @return MemberId 集团账号的成员 id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员 id
     * @param MemberId 集团账号的成员 id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public DescribeSkillScanAlertListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSkillScanAlertListRequest(DescribeSkillScanAlertListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

