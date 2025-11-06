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
    * ES集群ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 起始偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 数据条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 访问IP
    */
    @SerializedName("RemoteIp")
    @Expose
    private String [] RemoteIp;

    /**
    * Request/Response 请求/返回, 非必填
    */
    @SerializedName("TraceType")
    @Expose
    private String [] TraceType;

    /**
    * Public/Private 公网访问/内网访问, 非必填
    */
    @SerializedName("NetType")
    @Expose
    private String [] NetType;

    /**
    * POST/GET/PUT/DELETE/HEAD/OPTIONS/PATCH/CONNECT/TRACE/CONNECT等, 非必填
    */
    @SerializedName("ReqTypeOrRspStatus")
    @Expose
    private String [] ReqTypeOrRspStatus;

    /**
    * 关键字模糊查询，支持Lucene Query String
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * Uri搜索
    */
    @SerializedName("Uri")
    @Expose
    private String Uri;

    /**
    * 集群节点IP
    */
    @SerializedName("NodeIp")
    @Expose
    private String [] NodeIp;

    /**
     * Get ES集群ID 
     * @return InstanceId ES集群ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ES集群ID
     * @param InstanceId ES集群ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 起始偏移量 
     * @return Offset 起始偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始偏移量
     * @param Offset 起始偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 数据条数 
     * @return Limit 数据条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 数据条数
     * @param Limit 数据条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 访问IP 
     * @return RemoteIp 访问IP
     */
    public String [] getRemoteIp() {
        return this.RemoteIp;
    }

    /**
     * Set 访问IP
     * @param RemoteIp 访问IP
     */
    public void setRemoteIp(String [] RemoteIp) {
        this.RemoteIp = RemoteIp;
    }

    /**
     * Get Request/Response 请求/返回, 非必填 
     * @return TraceType Request/Response 请求/返回, 非必填
     */
    public String [] getTraceType() {
        return this.TraceType;
    }

    /**
     * Set Request/Response 请求/返回, 非必填
     * @param TraceType Request/Response 请求/返回, 非必填
     */
    public void setTraceType(String [] TraceType) {
        this.TraceType = TraceType;
    }

    /**
     * Get Public/Private 公网访问/内网访问, 非必填 
     * @return NetType Public/Private 公网访问/内网访问, 非必填
     */
    public String [] getNetType() {
        return this.NetType;
    }

    /**
     * Set Public/Private 公网访问/内网访问, 非必填
     * @param NetType Public/Private 公网访问/内网访问, 非必填
     */
    public void setNetType(String [] NetType) {
        this.NetType = NetType;
    }

    /**
     * Get POST/GET/PUT/DELETE/HEAD/OPTIONS/PATCH/CONNECT/TRACE/CONNECT等, 非必填 
     * @return ReqTypeOrRspStatus POST/GET/PUT/DELETE/HEAD/OPTIONS/PATCH/CONNECT/TRACE/CONNECT等, 非必填
     */
    public String [] getReqTypeOrRspStatus() {
        return this.ReqTypeOrRspStatus;
    }

    /**
     * Set POST/GET/PUT/DELETE/HEAD/OPTIONS/PATCH/CONNECT/TRACE/CONNECT等, 非必填
     * @param ReqTypeOrRspStatus POST/GET/PUT/DELETE/HEAD/OPTIONS/PATCH/CONNECT/TRACE/CONNECT等, 非必填
     */
    public void setReqTypeOrRspStatus(String [] ReqTypeOrRspStatus) {
        this.ReqTypeOrRspStatus = ReqTypeOrRspStatus;
    }

    /**
     * Get 关键字模糊查询，支持Lucene Query String 
     * @return SearchKey 关键字模糊查询，支持Lucene Query String
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 关键字模糊查询，支持Lucene Query String
     * @param SearchKey 关键字模糊查询，支持Lucene Query String
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get Uri搜索 
     * @return Uri Uri搜索
     */
    public String getUri() {
        return this.Uri;
    }

    /**
     * Set Uri搜索
     * @param Uri Uri搜索
     */
    public void setUri(String Uri) {
        this.Uri = Uri;
    }

    /**
     * Get 集群节点IP 
     * @return NodeIp 集群节点IP
     */
    public String [] getNodeIp() {
        return this.NodeIp;
    }

    /**
     * Set 集群节点IP
     * @param NodeIp 集群节点IP
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

