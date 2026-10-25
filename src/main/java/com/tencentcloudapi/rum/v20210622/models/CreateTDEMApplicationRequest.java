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

public class CreateTDEMApplicationRequest extends AbstractModel {

    /**
    * <p>业务系统 ID（必填）</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>应用名称（必填）</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>应用类型。取值：web、wx-miniprogram、uniapp、ios、android、electron、rn（React Native）。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>应用描述（可选）</p>
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * <p>APM 实例 ID</p>
    */
    @SerializedName("ApmInstanceIds")
    @Expose
    private String [] ApmInstanceIds;

    /**
     * Get <p>业务系统 ID（必填）</p> 
     * @return InstanceId <p>业务系统 ID（必填）</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>业务系统 ID（必填）</p>
     * @param InstanceId <p>业务系统 ID（必填）</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>应用名称（必填）</p> 
     * @return Name <p>应用名称（必填）</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>应用名称（必填）</p>
     * @param Name <p>应用名称（必填）</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>应用类型。取值：web、wx-miniprogram、uniapp、ios、android、electron、rn（React Native）。</p> 
     * @return Type <p>应用类型。取值：web、wx-miniprogram、uniapp、ios、android、electron、rn（React Native）。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>应用类型。取值：web、wx-miniprogram、uniapp、ios、android、electron、rn（React Native）。</p>
     * @param Type <p>应用类型。取值：web、wx-miniprogram、uniapp、ios、android、electron、rn（React Native）。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>应用描述（可选）</p> 
     * @return Desc <p>应用描述（可选）</p>
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set <p>应用描述（可选）</p>
     * @param Desc <p>应用描述（可选）</p>
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get <p>APM 实例 ID</p> 
     * @return ApmInstanceIds <p>APM 实例 ID</p>
     */
    public String [] getApmInstanceIds() {
        return this.ApmInstanceIds;
    }

    /**
     * Set <p>APM 实例 ID</p>
     * @param ApmInstanceIds <p>APM 实例 ID</p>
     */
    public void setApmInstanceIds(String [] ApmInstanceIds) {
        this.ApmInstanceIds = ApmInstanceIds;
    }

    public CreateTDEMApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTDEMApplicationRequest(CreateTDEMApplicationRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.ApmInstanceIds != null) {
            this.ApmInstanceIds = new String[source.ApmInstanceIds.length];
            for (int i = 0; i < source.ApmInstanceIds.length; i++) {
                this.ApmInstanceIds[i] = new String(source.ApmInstanceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamArraySimple(map, prefix + "ApmInstanceIds.", this.ApmInstanceIds);

    }
}

