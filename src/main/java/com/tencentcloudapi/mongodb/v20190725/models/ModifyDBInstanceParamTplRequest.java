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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceParamTplRequest extends AbstractModel {

    /**
    * 待修改的参数模板 ID，示例：tpl-jglr91vew。
    */
    @SerializedName("TplId")
    @Expose
    private String TplId;

    /**
    * 待修改参数模板名称，为空时，保持原有名称。
    */
    @SerializedName("TplName")
    @Expose
    private String TplName;

    /**
    * 待修改参数模板描述，为空时，保持原有描述。
    */
    @SerializedName("TplDesc")
    @Expose
    private String TplDesc;

    /**
    * 待修改参数名及参数值，为空时，各参数保持原有值，支持单条或批量修改。
    */
    @SerializedName("Params")
    @Expose
    private ParamType [] Params;

    /**
     * Get 待修改的参数模板 ID，示例：tpl-jglr91vew。 
     * @return TplId 待修改的参数模板 ID，示例：tpl-jglr91vew。
     */
    public String getTplId() {
        return this.TplId;
    }

    /**
     * Set 待修改的参数模板 ID，示例：tpl-jglr91vew。
     * @param TplId 待修改的参数模板 ID，示例：tpl-jglr91vew。
     */
    public void setTplId(String TplId) {
        this.TplId = TplId;
    }

    /**
     * Get 待修改参数模板名称，为空时，保持原有名称。 
     * @return TplName 待修改参数模板名称，为空时，保持原有名称。
     */
    public String getTplName() {
        return this.TplName;
    }

    /**
     * Set 待修改参数模板名称，为空时，保持原有名称。
     * @param TplName 待修改参数模板名称，为空时，保持原有名称。
     */
    public void setTplName(String TplName) {
        this.TplName = TplName;
    }

    /**
     * Get 待修改参数模板描述，为空时，保持原有描述。 
     * @return TplDesc 待修改参数模板描述，为空时，保持原有描述。
     */
    public String getTplDesc() {
        return this.TplDesc;
    }

    /**
     * Set 待修改参数模板描述，为空时，保持原有描述。
     * @param TplDesc 待修改参数模板描述，为空时，保持原有描述。
     */
    public void setTplDesc(String TplDesc) {
        this.TplDesc = TplDesc;
    }

    /**
     * Get 待修改参数名及参数值，为空时，各参数保持原有值，支持单条或批量修改。 
     * @return Params 待修改参数名及参数值，为空时，各参数保持原有值，支持单条或批量修改。
     */
    public ParamType [] getParams() {
        return this.Params;
    }

    /**
     * Set 待修改参数名及参数值，为空时，各参数保持原有值，支持单条或批量修改。
     * @param Params 待修改参数名及参数值，为空时，各参数保持原有值，支持单条或批量修改。
     */
    public void setParams(ParamType [] Params) {
        this.Params = Params;
    }

    public ModifyDBInstanceParamTplRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceParamTplRequest(ModifyDBInstanceParamTplRequest source) {
        if (source.TplId != null) {
            this.TplId = new String(source.TplId);
        }
        if (source.TplName != null) {
            this.TplName = new String(source.TplName);
        }
        if (source.TplDesc != null) {
            this.TplDesc = new String(source.TplDesc);
        }
        if (source.Params != null) {
            this.Params = new ParamType[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new ParamType(source.Params[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TplId", this.TplId);
        this.setParamSimple(map, prefix + "TplName", this.TplName);
        this.setParamSimple(map, prefix + "TplDesc", this.TplDesc);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);

    }
}

