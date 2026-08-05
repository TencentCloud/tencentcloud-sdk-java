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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TransferToAgentItem extends AbstractModel {

    /**
    * <p>转智能体的function calling 名称</p>
    */
    @SerializedName("TransferToAgentName")
    @Expose
    private String TransferToAgentName;

    /**
    * <p>转智能体描述</p>
    */
    @SerializedName("TransferToAgentDesc")
    @Expose
    private String TransferToAgentDesc;

    /**
    * <p>目标智能体ID</p>
    */
    @SerializedName("TransferToAgentId")
    @Expose
    private Long TransferToAgentId;

    /**
     * Get <p>转智能体的function calling 名称</p> 
     * @return TransferToAgentName <p>转智能体的function calling 名称</p>
     */
    public String getTransferToAgentName() {
        return this.TransferToAgentName;
    }

    /**
     * Set <p>转智能体的function calling 名称</p>
     * @param TransferToAgentName <p>转智能体的function calling 名称</p>
     */
    public void setTransferToAgentName(String TransferToAgentName) {
        this.TransferToAgentName = TransferToAgentName;
    }

    /**
     * Get <p>转智能体描述</p> 
     * @return TransferToAgentDesc <p>转智能体描述</p>
     */
    public String getTransferToAgentDesc() {
        return this.TransferToAgentDesc;
    }

    /**
     * Set <p>转智能体描述</p>
     * @param TransferToAgentDesc <p>转智能体描述</p>
     */
    public void setTransferToAgentDesc(String TransferToAgentDesc) {
        this.TransferToAgentDesc = TransferToAgentDesc;
    }

    /**
     * Get <p>目标智能体ID</p> 
     * @return TransferToAgentId <p>目标智能体ID</p>
     */
    public Long getTransferToAgentId() {
        return this.TransferToAgentId;
    }

    /**
     * Set <p>目标智能体ID</p>
     * @param TransferToAgentId <p>目标智能体ID</p>
     */
    public void setTransferToAgentId(Long TransferToAgentId) {
        this.TransferToAgentId = TransferToAgentId;
    }

    public TransferToAgentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransferToAgentItem(TransferToAgentItem source) {
        if (source.TransferToAgentName != null) {
            this.TransferToAgentName = new String(source.TransferToAgentName);
        }
        if (source.TransferToAgentDesc != null) {
            this.TransferToAgentDesc = new String(source.TransferToAgentDesc);
        }
        if (source.TransferToAgentId != null) {
            this.TransferToAgentId = new Long(source.TransferToAgentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TransferToAgentName", this.TransferToAgentName);
        this.setParamSimple(map, prefix + "TransferToAgentDesc", this.TransferToAgentDesc);
        this.setParamSimple(map, prefix + "TransferToAgentId", this.TransferToAgentId);

    }
}

