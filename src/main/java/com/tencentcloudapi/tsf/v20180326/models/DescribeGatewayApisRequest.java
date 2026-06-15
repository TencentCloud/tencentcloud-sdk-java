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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGatewayApisRequest extends AbstractModel {

    /**
    * <p>分组ID</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>翻页偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页的记录数</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>搜索关键字，支持 API path</p>
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * <p>部署组ID</p>
    */
    @SerializedName("GatewayDeployGroupId")
    @Expose
    private String GatewayDeployGroupId;

    /**
    * <p>发布状态, drafted(未发布)/released(已发布)/releasing(发布中)/failed(发布失败)</p>
    */
    @SerializedName("ReleaseStatus")
    @Expose
    private String ReleaseStatus;

    /**
    * <p>返回扩展出参字段名</p>
    */
    @SerializedName("ExtendFieldList")
    @Expose
    private String [] ExtendFieldList;

    /**
    * <p>服务接口状态</p><p>枚举值：</p><ul><li>ONLINE： 在线状态</li><li>OFFLINE： 离线状态</li><li>UNKNOWN： 未知</li><li>DELETED： 查询MS API不存在</li></ul>
    */
    @SerializedName("ApiOnlineStatus")
    @Expose
    private String ApiOnlineStatus;

    /**
     * Get <p>分组ID</p> 
     * @return GroupId <p>分组ID</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>分组ID</p>
     * @param GroupId <p>分组ID</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>翻页偏移量</p> 
     * @return Offset <p>翻页偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>翻页偏移量</p>
     * @param Offset <p>翻页偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页的记录数</p> 
     * @return Limit <p>每页的记录数</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页的记录数</p>
     * @param Limit <p>每页的记录数</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>搜索关键字，支持 API path</p> 
     * @return SearchWord <p>搜索关键字，支持 API path</p>
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set <p>搜索关键字，支持 API path</p>
     * @param SearchWord <p>搜索关键字，支持 API path</p>
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get <p>部署组ID</p> 
     * @return GatewayDeployGroupId <p>部署组ID</p>
     */
    public String getGatewayDeployGroupId() {
        return this.GatewayDeployGroupId;
    }

    /**
     * Set <p>部署组ID</p>
     * @param GatewayDeployGroupId <p>部署组ID</p>
     */
    public void setGatewayDeployGroupId(String GatewayDeployGroupId) {
        this.GatewayDeployGroupId = GatewayDeployGroupId;
    }

    /**
     * Get <p>发布状态, drafted(未发布)/released(已发布)/releasing(发布中)/failed(发布失败)</p> 
     * @return ReleaseStatus <p>发布状态, drafted(未发布)/released(已发布)/releasing(发布中)/failed(发布失败)</p>
     */
    public String getReleaseStatus() {
        return this.ReleaseStatus;
    }

    /**
     * Set <p>发布状态, drafted(未发布)/released(已发布)/releasing(发布中)/failed(发布失败)</p>
     * @param ReleaseStatus <p>发布状态, drafted(未发布)/released(已发布)/releasing(发布中)/failed(发布失败)</p>
     */
    public void setReleaseStatus(String ReleaseStatus) {
        this.ReleaseStatus = ReleaseStatus;
    }

    /**
     * Get <p>返回扩展出参字段名</p> 
     * @return ExtendFieldList <p>返回扩展出参字段名</p>
     */
    public String [] getExtendFieldList() {
        return this.ExtendFieldList;
    }

    /**
     * Set <p>返回扩展出参字段名</p>
     * @param ExtendFieldList <p>返回扩展出参字段名</p>
     */
    public void setExtendFieldList(String [] ExtendFieldList) {
        this.ExtendFieldList = ExtendFieldList;
    }

    /**
     * Get <p>服务接口状态</p><p>枚举值：</p><ul><li>ONLINE： 在线状态</li><li>OFFLINE： 离线状态</li><li>UNKNOWN： 未知</li><li>DELETED： 查询MS API不存在</li></ul> 
     * @return ApiOnlineStatus <p>服务接口状态</p><p>枚举值：</p><ul><li>ONLINE： 在线状态</li><li>OFFLINE： 离线状态</li><li>UNKNOWN： 未知</li><li>DELETED： 查询MS API不存在</li></ul>
     */
    public String getApiOnlineStatus() {
        return this.ApiOnlineStatus;
    }

    /**
     * Set <p>服务接口状态</p><p>枚举值：</p><ul><li>ONLINE： 在线状态</li><li>OFFLINE： 离线状态</li><li>UNKNOWN： 未知</li><li>DELETED： 查询MS API不存在</li></ul>
     * @param ApiOnlineStatus <p>服务接口状态</p><p>枚举值：</p><ul><li>ONLINE： 在线状态</li><li>OFFLINE： 离线状态</li><li>UNKNOWN： 未知</li><li>DELETED： 查询MS API不存在</li></ul>
     */
    public void setApiOnlineStatus(String ApiOnlineStatus) {
        this.ApiOnlineStatus = ApiOnlineStatus;
    }

    public DescribeGatewayApisRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGatewayApisRequest(DescribeGatewayApisRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.GatewayDeployGroupId != null) {
            this.GatewayDeployGroupId = new String(source.GatewayDeployGroupId);
        }
        if (source.ReleaseStatus != null) {
            this.ReleaseStatus = new String(source.ReleaseStatus);
        }
        if (source.ExtendFieldList != null) {
            this.ExtendFieldList = new String[source.ExtendFieldList.length];
            for (int i = 0; i < source.ExtendFieldList.length; i++) {
                this.ExtendFieldList[i] = new String(source.ExtendFieldList[i]);
            }
        }
        if (source.ApiOnlineStatus != null) {
            this.ApiOnlineStatus = new String(source.ApiOnlineStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "GatewayDeployGroupId", this.GatewayDeployGroupId);
        this.setParamSimple(map, prefix + "ReleaseStatus", this.ReleaseStatus);
        this.setParamArraySimple(map, prefix + "ExtendFieldList.", this.ExtendFieldList);
        this.setParamSimple(map, prefix + "ApiOnlineStatus", this.ApiOnlineStatus);

    }
}

