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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScdnAclConfig extends AbstractModel{

    /**
    * 是否开启，on | off
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Acl规则组，switch为on时必填
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptData")
    @Expose
    private ScdnAclGroup [] ScriptData;

    /**
    * 错误页面配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorPage")
    @Expose
    private ScdnErrorPage ErrorPage;

    /**
     * Get 是否开启，on | off 
     * @return Switch 是否开启，on | off
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 是否开启，on | off
     * @param Switch 是否开启，on | off
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Acl规则组，switch为on时必填
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptData Acl规则组，switch为on时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScdnAclGroup [] getScriptData() {
        return this.ScriptData;
    }

    /**
     * Set Acl规则组，switch为on时必填
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptData Acl规则组，switch为on时必填
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptData(ScdnAclGroup [] ScriptData) {
        this.ScriptData = ScriptData;
    }

    /**
     * Get 错误页面配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorPage 错误页面配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScdnErrorPage getErrorPage() {
        return this.ErrorPage;
    }

    /**
     * Set 错误页面配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorPage 错误页面配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorPage(ScdnErrorPage ErrorPage) {
        this.ErrorPage = ErrorPage;
    }

    public ScdnAclConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScdnAclConfig(ScdnAclConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.ScriptData != null) {
            this.ScriptData = new ScdnAclGroup[source.ScriptData.length];
            for (int i = 0; i < source.ScriptData.length; i++) {
                this.ScriptData[i] = new ScdnAclGroup(source.ScriptData[i]);
            }
        }
        if (source.ErrorPage != null) {
            this.ErrorPage = new ScdnErrorPage(source.ErrorPage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "ScriptData.", this.ScriptData);
        this.setParamObj(map, prefix + "ErrorPage.", this.ErrorPage);

    }
}

