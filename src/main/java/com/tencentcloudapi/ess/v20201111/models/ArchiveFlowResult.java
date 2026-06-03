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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ArchiveFlowResult extends AbstractModel {

    /**
    * <p>归档合同id</p>
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * <p>合同处理结果</p><p>枚举值：</p><ul><li>0： 成功</li><li>1： 失败</li></ul>
    */
    @SerializedName("ArchiveFlowStatus")
    @Expose
    private Long ArchiveFlowStatus;

    /**
    * <p>业务自定义id</p>
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * <p>资源ID列表</p>
    */
    @SerializedName("ResourceIdList")
    @Expose
    private String [] ResourceIdList;

    /**
    * <p>错误信息</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
     * Get <p>归档合同id</p> 
     * @return FlowId <p>归档合同id</p>
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>归档合同id</p>
     * @param FlowId <p>归档合同id</p>
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>合同处理结果</p><p>枚举值：</p><ul><li>0： 成功</li><li>1： 失败</li></ul> 
     * @return ArchiveFlowStatus <p>合同处理结果</p><p>枚举值：</p><ul><li>0： 成功</li><li>1： 失败</li></ul>
     */
    public Long getArchiveFlowStatus() {
        return this.ArchiveFlowStatus;
    }

    /**
     * Set <p>合同处理结果</p><p>枚举值：</p><ul><li>0： 成功</li><li>1： 失败</li></ul>
     * @param ArchiveFlowStatus <p>合同处理结果</p><p>枚举值：</p><ul><li>0： 成功</li><li>1： 失败</li></ul>
     */
    public void setArchiveFlowStatus(Long ArchiveFlowStatus) {
        this.ArchiveFlowStatus = ArchiveFlowStatus;
    }

    /**
     * Get <p>业务自定义id</p> 
     * @return BusinessId <p>业务自定义id</p>
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set <p>业务自定义id</p>
     * @param BusinessId <p>业务自定义id</p>
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get <p>资源ID列表</p> 
     * @return ResourceIdList <p>资源ID列表</p>
     */
    public String [] getResourceIdList() {
        return this.ResourceIdList;
    }

    /**
     * Set <p>资源ID列表</p>
     * @param ResourceIdList <p>资源ID列表</p>
     */
    public void setResourceIdList(String [] ResourceIdList) {
        this.ResourceIdList = ResourceIdList;
    }

    /**
     * Get <p>错误信息</p> 
     * @return ErrorMessage <p>错误信息</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>错误信息</p>
     * @param ErrorMessage <p>错误信息</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    public ArchiveFlowResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ArchiveFlowResult(ArchiveFlowResult source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.ArchiveFlowStatus != null) {
            this.ArchiveFlowStatus = new Long(source.ArchiveFlowStatus);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
        if (source.ResourceIdList != null) {
            this.ResourceIdList = new String[source.ResourceIdList.length];
            for (int i = 0; i < source.ResourceIdList.length; i++) {
                this.ResourceIdList[i] = new String(source.ResourceIdList[i]);
            }
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "ArchiveFlowStatus", this.ArchiveFlowStatus);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamArraySimple(map, prefix + "ResourceIdList.", this.ResourceIdList);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);

    }
}

