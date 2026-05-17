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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProcedureTemplatesRequest extends AbstractModel {

    /**
    * <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>任务流模板名字过滤条件，数组长度限制：100。</p>
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * <p>任务流模板类型过滤条件，可选值：</p><li>Preset：系统预置任务流模板；</li><li>Custom：用户自定义任务流模板。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>分页偏移量，默认值：0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回记录条数，默认值：10，最大值：100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>指定字段对返回结果进行生序或者降序Sort.Field 目前只支持 CreateTime 。Sort.Order 为 desc（降序）或者 asc（升序）</p><p>入参限制：当前仅支持排序字段为CreateTime</p>
    */
    @SerializedName("SortBy")
    @Expose
    private SortBy [] SortBy;

    /**
     * Get <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p> 
     * @return SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     * @param SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>任务流模板名字过滤条件，数组长度限制：100。</p> 
     * @return Names <p>任务流模板名字过滤条件，数组长度限制：100。</p>
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set <p>任务流模板名字过滤条件，数组长度限制：100。</p>
     * @param Names <p>任务流模板名字过滤条件，数组长度限制：100。</p>
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get <p>任务流模板类型过滤条件，可选值：</p><li>Preset：系统预置任务流模板；</li><li>Custom：用户自定义任务流模板。</li> 
     * @return Type <p>任务流模板类型过滤条件，可选值：</p><li>Preset：系统预置任务流模板；</li><li>Custom：用户自定义任务流模板。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>任务流模板类型过滤条件，可选值：</p><li>Preset：系统预置任务流模板；</li><li>Custom：用户自定义任务流模板。</li>
     * @param Type <p>任务流模板类型过滤条件，可选值：</p><li>Preset：系统预置任务流模板；</li><li>Custom：用户自定义任务流模板。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>分页偏移量，默认值：0。</p> 
     * @return Offset <p>分页偏移量，默认值：0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，默认值：0。</p>
     * @param Offset <p>分页偏移量，默认值：0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回记录条数，默认值：10，最大值：100。</p> 
     * @return Limit <p>返回记录条数，默认值：10，最大值：100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回记录条数，默认值：10，最大值：100。</p>
     * @param Limit <p>返回记录条数，默认值：10，最大值：100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>指定字段对返回结果进行生序或者降序Sort.Field 目前只支持 CreateTime 。Sort.Order 为 desc（降序）或者 asc（升序）</p><p>入参限制：当前仅支持排序字段为CreateTime</p> 
     * @return SortBy <p>指定字段对返回结果进行生序或者降序Sort.Field 目前只支持 CreateTime 。Sort.Order 为 desc（降序）或者 asc（升序）</p><p>入参限制：当前仅支持排序字段为CreateTime</p>
     */
    public SortBy [] getSortBy() {
        return this.SortBy;
    }

    /**
     * Set <p>指定字段对返回结果进行生序或者降序Sort.Field 目前只支持 CreateTime 。Sort.Order 为 desc（降序）或者 asc（升序）</p><p>入参限制：当前仅支持排序字段为CreateTime</p>
     * @param SortBy <p>指定字段对返回结果进行生序或者降序Sort.Field 目前只支持 CreateTime 。Sort.Order 为 desc（降序）或者 asc（升序）</p><p>入参限制：当前仅支持排序字段为CreateTime</p>
     */
    public void setSortBy(SortBy [] SortBy) {
        this.SortBy = SortBy;
    }

    public DescribeProcedureTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProcedureTemplatesRequest(DescribeProcedureTemplatesRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SortBy != null) {
            this.SortBy = new SortBy[source.SortBy.length];
            for (int i = 0; i < source.SortBy.length; i++) {
                this.SortBy[i] = new SortBy(source.SortBy[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "SortBy.", this.SortBy);

    }
}

