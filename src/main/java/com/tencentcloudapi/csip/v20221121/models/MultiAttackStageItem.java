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

public class MultiAttackStageItem extends AbstractModel {

    /**
    * <p>表id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>APPID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>告警ID</p>
    */
    @SerializedName("AlertId")
    @Expose
    private String AlertId;

    /**
    * <p>攻击阶段列表</p>
    */
    @SerializedName("AttackStages")
    @Expose
    private String [] AttackStages;

    /**
     * Get <p>表id</p> 
     * @return Id <p>表id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>表id</p>
     * @param Id <p>表id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>APPID</p> 
     * @return AppId <p>APPID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>APPID</p>
     * @param AppId <p>APPID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>告警ID</p> 
     * @return AlertId <p>告警ID</p>
     */
    public String getAlertId() {
        return this.AlertId;
    }

    /**
     * Set <p>告警ID</p>
     * @param AlertId <p>告警ID</p>
     */
    public void setAlertId(String AlertId) {
        this.AlertId = AlertId;
    }

    /**
     * Get <p>攻击阶段列表</p> 
     * @return AttackStages <p>攻击阶段列表</p>
     */
    public String [] getAttackStages() {
        return this.AttackStages;
    }

    /**
     * Set <p>攻击阶段列表</p>
     * @param AttackStages <p>攻击阶段列表</p>
     */
    public void setAttackStages(String [] AttackStages) {
        this.AttackStages = AttackStages;
    }

    public MultiAttackStageItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiAttackStageItem(MultiAttackStageItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AlertId != null) {
            this.AlertId = new String(source.AlertId);
        }
        if (source.AttackStages != null) {
            this.AttackStages = new String[source.AttackStages.length];
            for (int i = 0; i < source.AttackStages.length; i++) {
                this.AttackStages[i] = new String(source.AttackStages[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AlertId", this.AlertId);
        this.setParamArraySimple(map, prefix + "AttackStages.", this.AttackStages);

    }
}

