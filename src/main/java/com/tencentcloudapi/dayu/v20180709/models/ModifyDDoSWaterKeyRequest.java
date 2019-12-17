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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDDoSWaterKeyRequest extends AbstractModel{

    /**
    * 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 策略ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 密钥操作，取值：[add（添加），delete（删除），open（开启），close（关闭），get（获取密钥）]
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 密钥ID，当添加密钥操作时可以不填或填0，其他操作时必须填写；
    */
    @SerializedName("KeyId")
    @Expose
    private Long KeyId;

    /**
     * Get 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版） 
     * @return Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     * @param Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 策略ID 
     * @return PolicyId 策略ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略ID
     * @param PolicyId 策略ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 密钥操作，取值：[add（添加），delete（删除），open（开启），close（关闭），get（获取密钥）] 
     * @return Method 密钥操作，取值：[add（添加），delete（删除），open（开启），close（关闭），get（获取密钥）]
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 密钥操作，取值：[add（添加），delete（删除），open（开启），close（关闭），get（获取密钥）]
     * @param Method 密钥操作，取值：[add（添加），delete（删除），open（开启），close（关闭），get（获取密钥）]
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 密钥ID，当添加密钥操作时可以不填或填0，其他操作时必须填写； 
     * @return KeyId 密钥ID，当添加密钥操作时可以不填或填0，其他操作时必须填写；
     */
    public Long getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 密钥ID，当添加密钥操作时可以不填或填0，其他操作时必须填写；
     * @param KeyId 密钥ID，当添加密钥操作时可以不填或填0，其他操作时必须填写；
     */
    public void setKeyId(Long KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);

    }
}

