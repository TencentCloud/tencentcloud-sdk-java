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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitServerRollbackRequest extends AbstractModel {

    /**
    * 环境Id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 服务名
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * 当前版本
    */
    @SerializedName("CurrentVersionName")
    @Expose
    private String CurrentVersionName;

    /**
    * 回滚版本
    */
    @SerializedName("RollbackVersionName")
    @Expose
    private String RollbackVersionName;

    /**
    * 操作标识
    */
    @SerializedName("OperatorRemark")
    @Expose
    private String OperatorRemark;

    /**
     * Get 环境Id 
     * @return EnvId 环境Id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境Id
     * @param EnvId 环境Id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 服务名 
     * @return ServerName 服务名
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set 服务名
     * @param ServerName 服务名
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get 当前版本 
     * @return CurrentVersionName 当前版本
     */
    public String getCurrentVersionName() {
        return this.CurrentVersionName;
    }

    /**
     * Set 当前版本
     * @param CurrentVersionName 当前版本
     */
    public void setCurrentVersionName(String CurrentVersionName) {
        this.CurrentVersionName = CurrentVersionName;
    }

    /**
     * Get 回滚版本 
     * @return RollbackVersionName 回滚版本
     */
    public String getRollbackVersionName() {
        return this.RollbackVersionName;
    }

    /**
     * Set 回滚版本
     * @param RollbackVersionName 回滚版本
     */
    public void setRollbackVersionName(String RollbackVersionName) {
        this.RollbackVersionName = RollbackVersionName;
    }

    /**
     * Get 操作标识 
     * @return OperatorRemark 操作标识
     */
    public String getOperatorRemark() {
        return this.OperatorRemark;
    }

    /**
     * Set 操作标识
     * @param OperatorRemark 操作标识
     */
    public void setOperatorRemark(String OperatorRemark) {
        this.OperatorRemark = OperatorRemark;
    }

    public SubmitServerRollbackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitServerRollbackRequest(SubmitServerRollbackRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.CurrentVersionName != null) {
            this.CurrentVersionName = new String(source.CurrentVersionName);
        }
        if (source.RollbackVersionName != null) {
            this.RollbackVersionName = new String(source.RollbackVersionName);
        }
        if (source.OperatorRemark != null) {
            this.OperatorRemark = new String(source.OperatorRemark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "CurrentVersionName", this.CurrentVersionName);
        this.setParamSimple(map, prefix + "RollbackVersionName", this.RollbackVersionName);
        this.setParamSimple(map, prefix + "OperatorRemark", this.OperatorRemark);

    }
}

