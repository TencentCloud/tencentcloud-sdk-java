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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDrmEncryptKeysRequest  extends AbstractModel{

    /**
    * 获取key所需要的参数。
    */
    @SerializedName("DrmGetKeyPara")
    @Expose
    private DrmGetKeyPara DrmGetKeyPara;

    /**
    * base64 编码的DrmGetKeyPara参数数字签名。
    */
    @SerializedName("RsaSignature")
    @Expose
    private String RsaSignature;

    /**
     * 获取获取key所需要的参数。
     * @return DrmGetKeyPara 获取key所需要的参数。
     */
    public DrmGetKeyPara getDrmGetKeyPara() {
        return this.DrmGetKeyPara;
    }

    /**
     * 设置获取key所需要的参数。
     * @param DrmGetKeyPara 获取key所需要的参数。
     */
    public void setDrmGetKeyPara(DrmGetKeyPara DrmGetKeyPara) {
        this.DrmGetKeyPara = DrmGetKeyPara;
    }

    /**
     * 获取base64 编码的DrmGetKeyPara参数数字签名。
     * @return RsaSignature base64 编码的DrmGetKeyPara参数数字签名。
     */
    public String getRsaSignature() {
        return this.RsaSignature;
    }

    /**
     * 设置base64 编码的DrmGetKeyPara参数数字签名。
     * @param RsaSignature base64 编码的DrmGetKeyPara参数数字签名。
     */
    public void setRsaSignature(String RsaSignature) {
        this.RsaSignature = RsaSignature;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DrmGetKeyPara.", this.DrmGetKeyPara);
        this.setParamSimple(map, prefix + "RsaSignature", this.RsaSignature);

    }
}

