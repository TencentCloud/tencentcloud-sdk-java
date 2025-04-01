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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TWeCallActiveInfo extends AbstractModel {

    /**
    * 小程序ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * Sn信息
    */
    @SerializedName("Sn")
    @Expose
    private String Sn;

    /**
    * 过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 类型
    */
    @SerializedName("PkgType")
    @Expose
    private Long PkgType;

    /**
     * Get 小程序ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelId 小程序ID
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 小程序ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelId 小程序ID
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get Sn信息 
     * @return Sn Sn信息
     */
    public String getSn() {
        return this.Sn;
    }

    /**
     * Set Sn信息
     * @param Sn Sn信息
     */
    public void setSn(String Sn) {
        this.Sn = Sn;
    }

    /**
     * Get 过期时间 
     * @return ExpireTime 过期时间
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
     * @param ExpireTime 过期时间
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 类型 
     * @return PkgType 类型
     */
    public Long getPkgType() {
        return this.PkgType;
    }

    /**
     * Set 类型
     * @param PkgType 类型
     */
    public void setPkgType(Long PkgType) {
        this.PkgType = PkgType;
    }

    public TWeCallActiveInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TWeCallActiveInfo(TWeCallActiveInfo source) {
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.Sn != null) {
            this.Sn = new String(source.Sn);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.PkgType != null) {
            this.PkgType = new Long(source.PkgType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "Sn", this.Sn);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "PkgType", this.PkgType);

    }
}

