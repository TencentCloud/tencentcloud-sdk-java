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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTDEMFunnelRequest extends AbstractModel {

    /**
    * <p>应用id</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>漏斗名</p>
    */
    @SerializedName("FunnelName")
    @Expose
    private String FunnelName;

    /**
    * <p>漏斗步骤</p>
    */
    @SerializedName("Steps")
    @Expose
    private FunnelStepInput [] Steps;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>漏斗状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>漏斗来源</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
     * Get <p>应用id</p> 
     * @return AppId <p>应用id</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用id</p>
     * @param AppId <p>应用id</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>漏斗名</p> 
     * @return FunnelName <p>漏斗名</p>
     */
    public String getFunnelName() {
        return this.FunnelName;
    }

    /**
     * Set <p>漏斗名</p>
     * @param FunnelName <p>漏斗名</p>
     */
    public void setFunnelName(String FunnelName) {
        this.FunnelName = FunnelName;
    }

    /**
     * Get <p>漏斗步骤</p> 
     * @return Steps <p>漏斗步骤</p>
     */
    public FunnelStepInput [] getSteps() {
        return this.Steps;
    }

    /**
     * Set <p>漏斗步骤</p>
     * @param Steps <p>漏斗步骤</p>
     */
    public void setSteps(FunnelStepInput [] Steps) {
        this.Steps = Steps;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>漏斗状态</p> 
     * @return Status <p>漏斗状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>漏斗状态</p>
     * @param Status <p>漏斗状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>漏斗来源</p> 
     * @return Source <p>漏斗来源</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>漏斗来源</p>
     * @param Source <p>漏斗来源</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    public CreateTDEMFunnelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTDEMFunnelRequest(CreateTDEMFunnelRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.FunnelName != null) {
            this.FunnelName = new String(source.FunnelName);
        }
        if (source.Steps != null) {
            this.Steps = new FunnelStepInput[source.Steps.length];
            for (int i = 0; i < source.Steps.length; i++) {
                this.Steps[i] = new FunnelStepInput(source.Steps[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "FunnelName", this.FunnelName);
        this.setParamArrayObj(map, prefix + "Steps.", this.Steps);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Source", this.Source);

    }
}

