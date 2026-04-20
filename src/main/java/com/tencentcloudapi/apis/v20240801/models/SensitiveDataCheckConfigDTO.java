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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SensitiveDataCheckConfigDTO extends AbstractModel {

    /**
    * <p>执行动作</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>响应拦截内容</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InterceptMessage")
    @Expose
    private String InterceptMessage;

    /**
    * <p>检测项</p><p>枚举值：</p><ul><li>birthday： 生日</li><li>email： 邮箱</li><li>identity_number： 身份证</li><li>phone_number： 电话号码</li><li>secret： 秘钥</li><li>password： 密码</li><li>private_key： 私钥</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckItems")
    @Expose
    private String [] CheckItems;

    /**
     * Get <p>执行动作</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action <p>执行动作</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>执行动作</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action <p>执行动作</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>响应拦截内容</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InterceptMessage <p>响应拦截内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInterceptMessage() {
        return this.InterceptMessage;
    }

    /**
     * Set <p>响应拦截内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InterceptMessage <p>响应拦截内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInterceptMessage(String InterceptMessage) {
        this.InterceptMessage = InterceptMessage;
    }

    /**
     * Get <p>检测项</p><p>枚举值：</p><ul><li>birthday： 生日</li><li>email： 邮箱</li><li>identity_number： 身份证</li><li>phone_number： 电话号码</li><li>secret： 秘钥</li><li>password： 密码</li><li>private_key： 私钥</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckItems <p>检测项</p><p>枚举值：</p><ul><li>birthday： 生日</li><li>email： 邮箱</li><li>identity_number： 身份证</li><li>phone_number： 电话号码</li><li>secret： 秘钥</li><li>password： 密码</li><li>private_key： 私钥</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCheckItems() {
        return this.CheckItems;
    }

    /**
     * Set <p>检测项</p><p>枚举值：</p><ul><li>birthday： 生日</li><li>email： 邮箱</li><li>identity_number： 身份证</li><li>phone_number： 电话号码</li><li>secret： 秘钥</li><li>password： 密码</li><li>private_key： 私钥</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckItems <p>检测项</p><p>枚举值：</p><ul><li>birthday： 生日</li><li>email： 邮箱</li><li>identity_number： 身份证</li><li>phone_number： 电话号码</li><li>secret： 秘钥</li><li>password： 密码</li><li>private_key： 私钥</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckItems(String [] CheckItems) {
        this.CheckItems = CheckItems;
    }

    public SensitiveDataCheckConfigDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SensitiveDataCheckConfigDTO(SensitiveDataCheckConfigDTO source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.InterceptMessage != null) {
            this.InterceptMessage = new String(source.InterceptMessage);
        }
        if (source.CheckItems != null) {
            this.CheckItems = new String[source.CheckItems.length];
            for (int i = 0; i < source.CheckItems.length; i++) {
                this.CheckItems[i] = new String(source.CheckItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "InterceptMessage", this.InterceptMessage);
        this.setParamArraySimple(map, prefix + "CheckItems.", this.CheckItems);

    }
}

