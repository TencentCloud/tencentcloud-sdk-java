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
package com.tencentcloudapi.bsca.v20210811.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComponentVersion extends AbstractModel {

    /**
    * 该组件的PURL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PURL")
    @Expose
    private PURL PURL;

    /**
    * 该组件版本的许可证表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LicenseExpression")
    @Expose
    private String LicenseExpression;

    /**
     * Get 该组件的PURL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PURL 该组件的PURL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PURL getPURL() {
        return this.PURL;
    }

    /**
     * Set 该组件的PURL
注意：此字段可能返回 null，表示取不到有效值。
     * @param PURL 该组件的PURL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPURL(PURL PURL) {
        this.PURL = PURL;
    }

    /**
     * Get 该组件版本的许可证表达式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LicenseExpression 该组件版本的许可证表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLicenseExpression() {
        return this.LicenseExpression;
    }

    /**
     * Set 该组件版本的许可证表达式
注意：此字段可能返回 null，表示取不到有效值。
     * @param LicenseExpression 该组件版本的许可证表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLicenseExpression(String LicenseExpression) {
        this.LicenseExpression = LicenseExpression;
    }

    public ComponentVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComponentVersion(ComponentVersion source) {
        if (source.PURL != null) {
            this.PURL = new PURL(source.PURL);
        }
        if (source.LicenseExpression != null) {
            this.LicenseExpression = new String(source.LicenseExpression);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PURL.", this.PURL);
        this.setParamSimple(map, prefix + "LicenseExpression", this.LicenseExpression);

    }
}

