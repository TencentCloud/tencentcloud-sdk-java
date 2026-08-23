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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegistryConnDetectResult extends AbstractModel {

    /**
    * <p>链接信息</p>
    */
    @SerializedName("ConnDetectMessage")
    @Expose
    private String ConnDetectMessage;

    /**
    * <p>链接状态</p>
    */
    @SerializedName("ConnDetectStatus")
    @Expose
    private String ConnDetectStatus;

    /**
    * <p>失败原因</p>
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * <p>主机quuid</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>失败解决方案</p>
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * <p>主机uuid</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
     * Get <p>链接信息</p> 
     * @return ConnDetectMessage <p>链接信息</p>
     */
    public String getConnDetectMessage() {
        return this.ConnDetectMessage;
    }

    /**
     * Set <p>链接信息</p>
     * @param ConnDetectMessage <p>链接信息</p>
     */
    public void setConnDetectMessage(String ConnDetectMessage) {
        this.ConnDetectMessage = ConnDetectMessage;
    }

    /**
     * Get <p>链接状态</p> 
     * @return ConnDetectStatus <p>链接状态</p>
     */
    public String getConnDetectStatus() {
        return this.ConnDetectStatus;
    }

    /**
     * Set <p>链接状态</p>
     * @param ConnDetectStatus <p>链接状态</p>
     */
    public void setConnDetectStatus(String ConnDetectStatus) {
        this.ConnDetectStatus = ConnDetectStatus;
    }

    /**
     * Get <p>失败原因</p> 
     * @return FailReason <p>失败原因</p>
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set <p>失败原因</p>
     * @param FailReason <p>失败原因</p>
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get <p>主机quuid</p> 
     * @return Quuid <p>主机quuid</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>主机quuid</p>
     * @param Quuid <p>主机quuid</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>失败解决方案</p> 
     * @return Solution <p>失败解决方案</p>
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set <p>失败解决方案</p>
     * @param Solution <p>失败解决方案</p>
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get <p>主机uuid</p> 
     * @return Uuid <p>主机uuid</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>主机uuid</p>
     * @param Uuid <p>主机uuid</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    public RegistryConnDetectResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegistryConnDetectResult(RegistryConnDetectResult source) {
        if (source.ConnDetectMessage != null) {
            this.ConnDetectMessage = new String(source.ConnDetectMessage);
        }
        if (source.ConnDetectStatus != null) {
            this.ConnDetectStatus = new String(source.ConnDetectStatus);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConnDetectMessage", this.ConnDetectMessage);
        this.setParamSimple(map, prefix + "ConnDetectStatus", this.ConnDetectStatus);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);

    }
}

