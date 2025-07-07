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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterNodesRequest extends AbstractModel {

    /**
    * 集群实例ID,实例ID形如: emr-xxxxxxxx
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 节点标识，取值为：
<li>all：表示获取全部类型节点，cdb信息除外。</li>
<li>master：表示获取master节点信息。</li>
<li>core：表示获取core节点信息。</li>
<li>task：表示获取task节点信息。</li>
<li>common：表示获取common节点信息。</li>
<li>router：表示获取router节点信息。</li>
<li>db：表示获取正常状态的cdb信息。</li>
<li>recyle：表示获取回收站隔离中的节点信息，包括cdb信息。</li>
<li>renew：表示获取所有待续费的节点信息，包括cdb信息，自动续费节点不会返回。</li>
注意：现在只支持以上取值，输入其他值会导致错误。
    */
    @SerializedName("NodeFlag")
    @Expose
    private String NodeFlag;

    /**
    * 导出全部节点信息csv时是否携带cdb信息
    */
    @SerializedName("ExportDb")
    @Expose
    private Boolean ExportDb;

    /**
    * 页编号，默认值为0，表示第一页。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页返回数量，默认值为100，最大值为100。
如果offset和limit都不填，或者都填0，则返回全部数据
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 资源类型:支持all/host/pod，默认为all
    */
    @SerializedName("HardwareResourceType")
    @Expose
    private String HardwareResourceType;

    /**
    * 支持搜索的字段
    */
    @SerializedName("SearchFields")
    @Expose
    private SearchItem [] SearchFields;

    /**
    * 排序字段
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 是否升序，1:升序，0:降序
    */
    @SerializedName("Asc")
    @Expose
    private Long Asc;

    /**
     * Get 集群实例ID,实例ID形如: emr-xxxxxxxx 
     * @return InstanceId 集群实例ID,实例ID形如: emr-xxxxxxxx
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群实例ID,实例ID形如: emr-xxxxxxxx
     * @param InstanceId 集群实例ID,实例ID形如: emr-xxxxxxxx
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 节点标识，取值为：
<li>all：表示获取全部类型节点，cdb信息除外。</li>
<li>master：表示获取master节点信息。</li>
<li>core：表示获取core节点信息。</li>
<li>task：表示获取task节点信息。</li>
<li>common：表示获取common节点信息。</li>
<li>router：表示获取router节点信息。</li>
<li>db：表示获取正常状态的cdb信息。</li>
<li>recyle：表示获取回收站隔离中的节点信息，包括cdb信息。</li>
<li>renew：表示获取所有待续费的节点信息，包括cdb信息，自动续费节点不会返回。</li>
注意：现在只支持以上取值，输入其他值会导致错误。 
     * @return NodeFlag 节点标识，取值为：
<li>all：表示获取全部类型节点，cdb信息除外。</li>
<li>master：表示获取master节点信息。</li>
<li>core：表示获取core节点信息。</li>
<li>task：表示获取task节点信息。</li>
<li>common：表示获取common节点信息。</li>
<li>router：表示获取router节点信息。</li>
<li>db：表示获取正常状态的cdb信息。</li>
<li>recyle：表示获取回收站隔离中的节点信息，包括cdb信息。</li>
<li>renew：表示获取所有待续费的节点信息，包括cdb信息，自动续费节点不会返回。</li>
注意：现在只支持以上取值，输入其他值会导致错误。
     */
    public String getNodeFlag() {
        return this.NodeFlag;
    }

    /**
     * Set 节点标识，取值为：
<li>all：表示获取全部类型节点，cdb信息除外。</li>
<li>master：表示获取master节点信息。</li>
<li>core：表示获取core节点信息。</li>
<li>task：表示获取task节点信息。</li>
<li>common：表示获取common节点信息。</li>
<li>router：表示获取router节点信息。</li>
<li>db：表示获取正常状态的cdb信息。</li>
<li>recyle：表示获取回收站隔离中的节点信息，包括cdb信息。</li>
<li>renew：表示获取所有待续费的节点信息，包括cdb信息，自动续费节点不会返回。</li>
注意：现在只支持以上取值，输入其他值会导致错误。
     * @param NodeFlag 节点标识，取值为：
<li>all：表示获取全部类型节点，cdb信息除外。</li>
<li>master：表示获取master节点信息。</li>
<li>core：表示获取core节点信息。</li>
<li>task：表示获取task节点信息。</li>
<li>common：表示获取common节点信息。</li>
<li>router：表示获取router节点信息。</li>
<li>db：表示获取正常状态的cdb信息。</li>
<li>recyle：表示获取回收站隔离中的节点信息，包括cdb信息。</li>
<li>renew：表示获取所有待续费的节点信息，包括cdb信息，自动续费节点不会返回。</li>
注意：现在只支持以上取值，输入其他值会导致错误。
     */
    public void setNodeFlag(String NodeFlag) {
        this.NodeFlag = NodeFlag;
    }

    /**
     * Get 导出全部节点信息csv时是否携带cdb信息 
     * @return ExportDb 导出全部节点信息csv时是否携带cdb信息
     */
    public Boolean getExportDb() {
        return this.ExportDb;
    }

    /**
     * Set 导出全部节点信息csv时是否携带cdb信息
     * @param ExportDb 导出全部节点信息csv时是否携带cdb信息
     */
    public void setExportDb(Boolean ExportDb) {
        this.ExportDb = ExportDb;
    }

    /**
     * Get 页编号，默认值为0，表示第一页。 
     * @return Offset 页编号，默认值为0，表示第一页。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页编号，默认值为0，表示第一页。
     * @param Offset 页编号，默认值为0，表示第一页。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页返回数量，默认值为100，最大值为100。
如果offset和limit都不填，或者都填0，则返回全部数据 
     * @return Limit 每页返回数量，默认值为100，最大值为100。
如果offset和limit都不填，或者都填0，则返回全部数据
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页返回数量，默认值为100，最大值为100。
如果offset和limit都不填，或者都填0，则返回全部数据
     * @param Limit 每页返回数量，默认值为100，最大值为100。
如果offset和limit都不填，或者都填0，则返回全部数据
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 资源类型:支持all/host/pod，默认为all 
     * @return HardwareResourceType 资源类型:支持all/host/pod，默认为all
     */
    public String getHardwareResourceType() {
        return this.HardwareResourceType;
    }

    /**
     * Set 资源类型:支持all/host/pod，默认为all
     * @param HardwareResourceType 资源类型:支持all/host/pod，默认为all
     */
    public void setHardwareResourceType(String HardwareResourceType) {
        this.HardwareResourceType = HardwareResourceType;
    }

    /**
     * Get 支持搜索的字段 
     * @return SearchFields 支持搜索的字段
     */
    public SearchItem [] getSearchFields() {
        return this.SearchFields;
    }

    /**
     * Set 支持搜索的字段
     * @param SearchFields 支持搜索的字段
     */
    public void setSearchFields(SearchItem [] SearchFields) {
        this.SearchFields = SearchFields;
    }

    /**
     * Get 排序字段 
     * @return OrderField 排序字段
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段
     * @param OrderField 排序字段
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 是否升序，1:升序，0:降序 
     * @return Asc 是否升序，1:升序，0:降序
     */
    public Long getAsc() {
        return this.Asc;
    }

    /**
     * Set 是否升序，1:升序，0:降序
     * @param Asc 是否升序，1:升序，0:降序
     */
    public void setAsc(Long Asc) {
        this.Asc = Asc;
    }

    public DescribeClusterNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterNodesRequest(DescribeClusterNodesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NodeFlag != null) {
            this.NodeFlag = new String(source.NodeFlag);
        }
        if (source.ExportDb != null) {
            this.ExportDb = new Boolean(source.ExportDb);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.HardwareResourceType != null) {
            this.HardwareResourceType = new String(source.HardwareResourceType);
        }
        if (source.SearchFields != null) {
            this.SearchFields = new SearchItem[source.SearchFields.length];
            for (int i = 0; i < source.SearchFields.length; i++) {
                this.SearchFields[i] = new SearchItem(source.SearchFields[i]);
            }
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.Asc != null) {
            this.Asc = new Long(source.Asc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NodeFlag", this.NodeFlag);
        this.setParamSimple(map, prefix + "ExportDb", this.ExportDb);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "HardwareResourceType", this.HardwareResourceType);
        this.setParamArrayObj(map, prefix + "SearchFields.", this.SearchFields);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Asc", this.Asc);

    }
}

