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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetUserKeyInfo extends AbstractModel{

    /**
    * 公钥值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 公钥备注
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 加密方式
    */
    @SerializedName("EncryptType")
    @Expose
    private String EncryptType;

    /**
     * Get 公钥值 
     * @return Value 公钥值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 公钥值
     * @param Value 公钥值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 公钥备注 
     * @return Comment 公钥备注
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 公钥备注
     * @param Comment 公钥备注
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 加密方式 
     * @return EncryptType 加密方式
     */
    public String getEncryptType() {
        return this.EncryptType;
    }

    /**
     * Set 加密方式
     * @param EncryptType 加密方式
     */
    public void setEncryptType(String EncryptType) {
        this.EncryptType = EncryptType;
    }

    public AssetUserKeyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetUserKeyInfo(AssetUserKeyInfo source) {
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.EncryptType != null) {
            this.EncryptType = new String(source.EncryptType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "EncryptType", this.EncryptType);

    }
}

