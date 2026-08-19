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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryIpTraceLogRequest extends AbstractModel {

    /**
    * <p>ES集群ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>起始偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>数据条数</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>访问IP</p>
    */
    @SerializedName("RemoteIp")
    @Expose
    private String [] RemoteIp;

    /**
    * <p>Request/Response 请求/返回, 非必填</p>
    */
    @SerializedName("TraceType")
    @Expose
    private String [] TraceType;

    /**
    * <p>Public/Private 公网访问/内网访问, 非必填</p>
    */
    @SerializedName("NetType")
    @Expose
    private String [] NetType;

    /**
    * <p>POST/GET/PUT/DELETE/HEAD/OPTIONS/PATCH/CONNECT/TRACE/CONNECT等, 非必填</p>
    */
    @SerializedName("ReqTypeOrRspStatus")
    @Expose
    private String [] ReqTypeOrRspStatus;

    /**
    * <p>关键字模糊查询，支持Lucene Query String</p>
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * <p>Uri搜索</p>
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

    /**
    * <p>集群节点IP</p>
    */
    @SerializedName("NodeIp")
    @Expose
    private String [] NodeIp;

    /**
     * Get <p>ES集群ID</p> 
     * @return InstanceId <p>ES集群ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ES集群ID</p>
     * @param InstanceId <p>ES集群ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>起始偏移量</p> 
     * @return Offset <p>起始偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>起始偏移量</p>
     * @param Offset <p>起始偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>数据条数</p> 
     * @return Limit <p>数据条数</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>数据条数</p>
     * @param Limit <p>数据条数</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>访问IP</p> 
     * @return RemoteIp <p>访问IP</p>
     */
    public String [] getRemoteIp() {
        return this.RemoteIp;
    }

    /**
     * Set <p>访问IP</p>
     * @param RemoteIp <p>访问IP</p>
     */
    public void setRemoteIp(String [] RemoteIp) {
        this.RemoteIp = RemoteIp;
    }

    /**
     * Get <p>Request/Response 请求/返回, 非必填</p> 
     * @return TraceType <p>Request/Response 请求/返回, 非必填</p>
     */
    public String [] getTraceType() {
        return this.TraceType;
    }

    /**
     * Set <p>Request/Response 请求/返回, 非必填</p>
     * @param TraceType <p>Request/Response 请求/返回, 非必填</p>
     */
    public void setTraceType(String [] TraceType) {
        this.TraceType = TraceType;
    }

    /**
     * Get <p>Public/Private 公网访问/内网访问, 非必填</p> 
     * @return NetType <p>Public/Private 公网访问/内网访问, 非必填</p>
     */
    public String [] getNetType() {
        return this.NetType;
    }

    /**
     * Set <p>Public/Private 公网访问/内网访问, 非必填</p>
     * @param NetType <p>Public/Private 公网访问/内网访问, 非必填</p>
     */
    public void setNetType(String [] NetType) {
        this.NetType = NetType;
    }

    /**
     * Get <p>POST/GET/PUT/DELETE/HEAD/OPTIONS/PATCH/CONNECT/TRACE/CONNECT等, 非必填</p> 
     * @return ReqTypeOrRspStatus <p>POST/GET/PUT/DELETE/HEAD/OPTIONS/PATCH/CONNECT/TRACE/CONNECT等, 非必填</p>
     */
    public String [] getReqTypeOrRspStatus() {
        return this.ReqTypeOrRspStatus;
    }

    /**
     * Set <p>POST/GET/PUT/DELETE/HEAD/OPTIONS/PATCH/CONNECT/TRACE/CONNECT等, 非必填</p>
     * @param ReqTypeOrRspStatus <p>POST/GET/PUT/DELETE/HEAD/OPTIONS/PATCH/CONNECT/TRACE/CONNECT等, 非必填</p>
     */
    public void setReqTypeOrRspStatus(String [] ReqTypeOrRspStatus) {
        this.ReqTypeOrRspStatus = ReqTypeOrRspStatus;
    }

    /**
     * Get <p>关键字模糊查询，支持Lucene Query String</p> 
     * @return SearchKey <p>关键字模糊查询，支持Lucene Query String</p>
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set <p>关键字模糊查询，支持Lucene Query String</p>
     * @param SearchKey <p>关键字模糊查询，支持Lucene Query String</p>
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get <p>Uri搜索</p> 
     * @return Uri <p>Uri搜索</p>
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set <p>Uri搜索</p>
     * @param Uri <p>Uri搜索</p>
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
    }

    /**
     * Get <p>集群节点IP</p> 
     * @return NodeIp <p>集群节点IP</p>
     */
    public String [] getNodeIp() {
        return this.NodeIp;
    }

    /**
     * Set <p>集群节点IP</p>
     * @param NodeIp <p>集群节点IP</p>
     */
    public void setNodeIp(String [] NodeIp) {
        this.NodeIp = NodeIp;
    }

    public QueryIpTraceLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryIpTraceLogRequest(QueryIpTraceLogRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.RemoteIp != null) {
            this.RemoteIp = new String[source.RemoteIp.length];
            for (int i = 0; i < source.RemoteIp.length; i++) {
                this.RemoteIp[i] = new String(source.RemoteIp[i]);
            }
        }
        if (source.TraceType != null) {
            this.TraceType = new String[source.TraceType.length];
            for (int i = 0; i < source.TraceType.length; i++) {
                this.TraceType[i] = new String(source.TraceType[i]);
            }
        }
        if (source.NetType != null) {
            this.NetType = new String[source.NetType.length];
            for (int i = 0; i < source.NetType.length; i++) {
                this.NetType[i] = new String(source.NetType[i]);
            }
        }
        if (source.ReqTypeOrRspStatus != null) {
            this.ReqTypeOrRspStatus = new String[source.ReqTypeOrRspStatus.length];
            for (int i = 0; i < source.ReqTypeOrRspStatus.length; i++) {
                this.ReqTypeOrRspStatus[i] = new String(source.ReqTypeOrRspStatus[i]);
            }
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.Uri != null) {
            this.Uri = new String(source.Uri);
        }
        if (source.NodeIp != null) {
            this.NodeIp = new String[source.NodeIp.length];
            for (int i = 0; i < source.NodeIp.length; i++) {
                this.NodeIp[i] = new String(source.NodeIp[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "RemoteIp.", this.RemoteIp);
        this.setParamArraySimple(map, prefix + "TraceType.", this.TraceType);
        this.setParamArraySimple(map, prefix + "NetType.", this.NetType);
        this.setParamArraySimple(map, prefix + "ReqTypeOrRspStatus.", this.ReqTypeOrRspStatus);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "Uri", this.Uri);
        this.setParamArraySimple(map, prefix + "NodeIp.", this.NodeIp);

    }
}

