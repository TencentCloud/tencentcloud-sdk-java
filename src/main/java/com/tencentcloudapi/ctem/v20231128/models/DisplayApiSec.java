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
    * 主键ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 公共字段
    */
    @SerializedName("DisplayToolCommon")
    @Expose
    private DisplayToolCommon DisplayToolCommon;

    /**
    * Url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Host地址
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Path路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 方法：POST、GET、DELETE等
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 修复状态：unrepaired:未修复，repaired:已修复, ignore:已忽略,checking:复测中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 状态码
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 请求体
    */
    @SerializedName("Request")
    @Expose
    private String Request;

    /**
    * 响应体
    */
    @SerializedName("Response")
    @Expose
    private String Response;

    /**
    * 是否风险API
    */
    @SerializedName("IsRiskAPI")
    @Expose
    private Boolean IsRiskAPI;

    /**
     * Get 主键ID 
     * @return Id 主键ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 主键ID
     * @param Id 主键ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 公共字段 
     * @return DisplayToolCommon 公共字段
     */
    public DisplayToolCommon getDisplayToolCommon() {
        return this.DisplayToolCommon;
    }

    /**
     * Set 公共字段
     * @param DisplayToolCommon 公共字段
     */
    public void setDisplayToolCommon(DisplayToolCommon DisplayToolCommon) {
        this.DisplayToolCommon = DisplayToolCommon;
    }

    /**
     * Get Url 
     * @return Url Url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Url
     * @param Url Url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Host地址 
     * @return Host Host地址
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Host地址
     * @param Host Host地址
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Path路径 
     * @return Path Path路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Path路径
     * @param Path Path路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 方法：POST、GET、DELETE等 
     * @return Method 方法：POST、GET、DELETE等
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 方法：POST、GET、DELETE等
     * @param Method 方法：POST、GET、DELETE等
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 修复状态：unrepaired:未修复，repaired:已修复, ignore:已忽略,checking:复测中 
     * @return Status 修复状态：unrepaired:未修复，repaired:已修复, ignore:已忽略,checking:复测中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 修复状态：unrepaired:未修复，repaired:已修复, ignore:已忽略,checking:复测中
     * @param Status 修复状态：unrepaired:未修复，repaired:已修复, ignore:已忽略,checking:复测中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 状态码 
     * @return Code 状态码
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 状态码
     * @param Code 状态码
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 请求体 
     * @return Request 请求体
     */
    public String getRequest() {
        return this.Request;
    }

    /**
     * Set 请求体
     * @param Request 请求体
     */
    public void setRequest(String Request) {
        this.Request = Request;
    }

    /**
     * Get 响应体 
     * @return Response 响应体
     */
    public String getResponse() {
        return this.Response;
    }

    /**
     * Set 响应体
     * @param Response 响应体
     */
    public void setResponse(String Response) {
        this.Response = Response;
    }

    /**
     * Get 是否风险API 
     * @return IsRiskAPI 是否风险API
     */
    public Boolean getIsRiskAPI() {
        return this.IsRiskAPI;
    }

    /**
     * Set 是否风险API
     * @param IsRiskAPI 是否风险API
     */
    public void setIsRiskAPI(Boolean IsRiskAPI) {
        this.IsRiskAPI = IsRiskAPI;
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

    }
}

