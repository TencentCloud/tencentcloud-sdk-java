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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisplayApiSec extends AbstractModel {

    /**
    * <p>主键ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>公共字段</p>
    */
    @SerializedName("DisplayToolCommon")
    @Expose
    private DisplayToolCommon DisplayToolCommon;

    /**
    * <p>Url</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>Host地址</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>Path路径</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>方法：POST、GET、DELETE等</p>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * <p>修复状态：unrepaired:未修复，repaired:已修复, ignore:已忽略,checking:复测中</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>状态码</p>
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * <p>请求体</p>
    */
    @SerializedName("Request")
    @Expose
    private String Request;

    /**
    * <p>响应体</p>
    */
    @SerializedName("Response")
    @Expose
    private String Response;

    /**
    * <p>是否风险API</p>
    */
    @SerializedName("IsRiskAPI")
    @Expose
    private Boolean IsRiskAPI;

    /**
    * <p>聚合视角下该组真实子项总数；非聚合视角为 0</p>
    */
    @SerializedName("AggregationCount")
    @Expose
    private Long AggregationCount;

    /**
     * Get <p>主键ID</p> 
     * @return Id <p>主键ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>主键ID</p>
     * @param Id <p>主键ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>公共字段</p> 
     * @return DisplayToolCommon <p>公共字段</p>
     */
    public DisplayToolCommon getDisplayToolCommon() {
        return this.DisplayToolCommon;
    }

    /**
     * Set <p>公共字段</p>
     * @param DisplayToolCommon <p>公共字段</p>
     */
    public void setDisplayToolCommon(DisplayToolCommon DisplayToolCommon) {
        this.DisplayToolCommon = DisplayToolCommon;
    }

    /**
     * Get <p>Url</p> 
     * @return Url <p>Url</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>Url</p>
     * @param Url <p>Url</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>Host地址</p> 
     * @return Host <p>Host地址</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>Host地址</p>
     * @param Host <p>Host地址</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>Path路径</p> 
     * @return Path <p>Path路径</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>Path路径</p>
     * @param Path <p>Path路径</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>方法：POST、GET、DELETE等</p> 
     * @return Method <p>方法：POST、GET、DELETE等</p>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set <p>方法：POST、GET、DELETE等</p>
     * @param Method <p>方法：POST、GET、DELETE等</p>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get <p>修复状态：unrepaired:未修复，repaired:已修复, ignore:已忽略,checking:复测中</p> 
     * @return Status <p>修复状态：unrepaired:未修复，repaired:已修复, ignore:已忽略,checking:复测中</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>修复状态：unrepaired:未修复，repaired:已修复, ignore:已忽略,checking:复测中</p>
     * @param Status <p>修复状态：unrepaired:未修复，repaired:已修复, ignore:已忽略,checking:复测中</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>状态码</p> 
     * @return Code <p>状态码</p>
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set <p>状态码</p>
     * @param Code <p>状态码</p>
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get <p>请求体</p> 
     * @return Request <p>请求体</p>
     */
    public String getRequest() {
        return this.Request;
    }

    /**
     * Set <p>请求体</p>
     * @param Request <p>请求体</p>
     */
    public void setRequest(String Request) {
        this.Request = Request;
    }

    /**
     * Get <p>响应体</p> 
     * @return Response <p>响应体</p>
     */
    public String getResponse() {
        return this.Response;
    }

    /**
     * Set <p>响应体</p>
     * @param Response <p>响应体</p>
     */
    public void setResponse(String Response) {
        this.Response = Response;
    }

    /**
     * Get <p>是否风险API</p> 
     * @return IsRiskAPI <p>是否风险API</p>
     */
    public Boolean getIsRiskAPI() {
        return this.IsRiskAPI;
    }

    /**
     * Set <p>是否风险API</p>
     * @param IsRiskAPI <p>是否风险API</p>
     */
    public void setIsRiskAPI(Boolean IsRiskAPI) {
        this.IsRiskAPI = IsRiskAPI;
    }

    /**
     * Get <p>聚合视角下该组真实子项总数；非聚合视角为 0</p> 
     * @return AggregationCount <p>聚合视角下该组真实子项总数；非聚合视角为 0</p>
     */
    public Long getAggregationCount() {
        return this.AggregationCount;
    }

    /**
     * Set <p>聚合视角下该组真实子项总数；非聚合视角为 0</p>
     * @param AggregationCount <p>聚合视角下该组真实子项总数；非聚合视角为 0</p>
     */
    public void setAggregationCount(Long AggregationCount) {
        this.AggregationCount = AggregationCount;
    }

    public DisplayApiSec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisplayApiSec(DisplayApiSec source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DisplayToolCommon != null) {
            this.DisplayToolCommon = new DisplayToolCommon(source.DisplayToolCommon);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Request != null) {
            this.Request = new String(source.Request);
        }
        if (source.Response != null) {
            this.Response = new String(source.Response);
        }
        if (source.IsRiskAPI != null) {
            this.IsRiskAPI = new Boolean(source.IsRiskAPI);
        }
        if (source.AggregationCount != null) {
            this.AggregationCount = new Long(source.AggregationCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "DisplayToolCommon.", this.DisplayToolCommon);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Request", this.Request);
        this.setParamSimple(map, prefix + "Response", this.Response);
        this.setParamSimple(map, prefix + "IsRiskAPI", this.IsRiskAPI);
        this.setParamSimple(map, prefix + "AggregationCount", this.AggregationCount);

    }
}

