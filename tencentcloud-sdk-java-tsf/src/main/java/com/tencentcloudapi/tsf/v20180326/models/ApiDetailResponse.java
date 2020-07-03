/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiDetailResponse extends AbstractModel{

    /**
    * API 请求参数
    */
    @SerializedName("Request")
    @Expose
    private ApiRequestDescr [] Request;

    /**
    * API 响应参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Response")
    @Expose
    private ApiResponseDescr [] Response;

    /**
    * API 复杂结构定义
    */
    @SerializedName("Definitions")
    @Expose
    private ApiDefinitionDescr [] Definitions;

    /**
    * API 的 content type
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestContentType")
    @Expose
    private String RequestContentType;

    /**
    * API  能否调试
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanRun")
    @Expose
    private Boolean CanRun;

    /**
    * API 状态 0:离线 1:在线，默认0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get API 请求参数 
     * @return Request API 请求参数
     */
    public ApiRequestDescr [] getRequest() {
        return this.Request;
    }

    /**
     * Set API 请求参数
     * @param Request API 请求参数
     */
    public void setRequest(ApiRequestDescr [] Request) {
        this.Request = Request;
    }

    /**
     * Get API 响应参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Response API 响应参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApiResponseDescr [] getResponse() {
        return this.Response;
    }

    /**
     * Set API 响应参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Response API 响应参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponse(ApiResponseDescr [] Response) {
        this.Response = Response;
    }

    /**
     * Get API 复杂结构定义 
     * @return Definitions API 复杂结构定义
     */
    public ApiDefinitionDescr [] getDefinitions() {
        return this.Definitions;
    }

    /**
     * Set API 复杂结构定义
     * @param Definitions API 复杂结构定义
     */
    public void setDefinitions(ApiDefinitionDescr [] Definitions) {
        this.Definitions = Definitions;
    }

    /**
     * Get API 的 content type
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestContentType API 的 content type
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestContentType() {
        return this.RequestContentType;
    }

    /**
     * Set API 的 content type
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestContentType API 的 content type
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestContentType(String RequestContentType) {
        this.RequestContentType = RequestContentType;
    }

    /**
     * Get API  能否调试
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanRun API  能否调试
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanRun() {
        return this.CanRun;
    }

    /**
     * Set API  能否调试
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanRun API  能否调试
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanRun(Boolean CanRun) {
        this.CanRun = CanRun;
    }

    /**
     * Get API 状态 0:离线 1:在线，默认0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status API 状态 0:离线 1:在线，默认0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set API 状态 0:离线 1:在线，默认0
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status API 状态 0:离线 1:在线，默认0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Request.", this.Request);
        this.setParamArrayObj(map, prefix + "Response.", this.Response);
        this.setParamArrayObj(map, prefix + "Definitions.", this.Definitions);
        this.setParamSimple(map, prefix + "RequestContentType", this.RequestContentType);
        this.setParamSimple(map, prefix + "CanRun", this.CanRun);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

