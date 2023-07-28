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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegistryConnDetectResult extends AbstractModel{

    /**
    * 联通性检测的主机quuid 或者 backend
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 联通性检测的主机uuid 或者 backend
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 检测结果状态
    */
    @SerializedName("ConnDetectStatus")
    @Expose
    private String ConnDetectStatus;

    /**
    * 检测结果信息
    */
    @SerializedName("ConnDetectMessage")
    @Expose
    private String ConnDetectMessage;

    /**
    * 失败的解决方案
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * 失败原因
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
     * Get 联通性检测的主机quuid 或者 backend 
     * @return Quuid 联通性检测的主机quuid 或者 backend
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 联通性检测的主机quuid 或者 backend
     * @param Quuid 联通性检测的主机quuid 或者 backend
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 联通性检测的主机uuid 或者 backend 
     * @return Uuid 联通性检测的主机uuid 或者 backend
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 联通性检测的主机uuid 或者 backend
     * @param Uuid 联通性检测的主机uuid 或者 backend
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 检测结果状态 
     * @return ConnDetectStatus 检测结果状态
     */
    public String getConnDetectStatus() {
        return this.ConnDetectStatus;
    }

    /**
     * Set 检测结果状态
     * @param ConnDetectStatus 检测结果状态
     */
    public void setConnDetectStatus(String ConnDetectStatus) {
        this.ConnDetectStatus = ConnDetectStatus;
    }

    /**
     * Get 检测结果信息 
     * @return ConnDetectMessage 检测结果信息
     */
    public String getConnDetectMessage() {
        return this.ConnDetectMessage;
    }

    /**
     * Set 检测结果信息
     * @param ConnDetectMessage 检测结果信息
     */
    public void setConnDetectMessage(String ConnDetectMessage) {
        this.ConnDetectMessage = ConnDetectMessage;
    }

    /**
     * Get 失败的解决方案 
     * @return Solution 失败的解决方案
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set 失败的解决方案
     * @param Solution 失败的解决方案
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get 失败原因 
     * @return FailReason 失败原因
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 失败原因
     * @param FailReason 失败原因
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    public RegistryConnDetectResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegistryConnDetectResult(RegistryConnDetectResult source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.ConnDetectStatus != null) {
            this.ConnDetectStatus = new String(source.ConnDetectStatus);
        }
        if (source.ConnDetectMessage != null) {
            this.ConnDetectMessage = new String(source.ConnDetectMessage);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "ConnDetectStatus", this.ConnDetectStatus);
        this.setParamSimple(map, prefix + "ConnDetectMessage", this.ConnDetectMessage);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);

    }
}

