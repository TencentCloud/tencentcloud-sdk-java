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

public class WebhookReceiverBrief extends AbstractModel {

    /**
    * 机器人 ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 机器人名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 机器人类型
枚举值：
WEBHOOK：webhook 类型
SCF：云函数类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 机器人 ID 
     * @return ID 机器人 ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 机器人 ID
     * @param ID 机器人 ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 机器人名称 
     * @return Name 机器人名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 机器人名称
     * @param Name 机器人名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 机器人类型
枚举值：
WEBHOOK：webhook 类型
SCF：云函数类型 
     * @return Type 机器人类型
枚举值：
WEBHOOK：webhook 类型
SCF：云函数类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 机器人类型
枚举值：
WEBHOOK：webhook 类型
SCF：云函数类型
     * @param Type 机器人类型
枚举值：
WEBHOOK：webhook 类型
SCF：云函数类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public WebhookReceiverBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebhookReceiverBrief(WebhookReceiverBrief source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

