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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceParamTplDetailRequest extends AbstractModel {

    /**
    * 参数模板 ID。
    */
    @SerializedName("TplId")
    @Expose
    private String TplId;

    /**
    * 参数名称，传入该值，则只会获取该字段的参数详情。为空时，返回全部参数。
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
     * Get 参数模板 ID。 
     * @return TplId 参数模板 ID。
     */
    public String getTplId() {
        return this.TplId;
    }

    /**
     * Set 参数模板 ID。
     * @param TplId 参数模板 ID。
     */
    public void setTplId(String TplId) {
        this.TplId = TplId;
    }

    /**
     * Get 参数名称，传入该值，则只会获取该字段的参数详情。为空时，返回全部参数。 
     * @return ParamName 参数名称，传入该值，则只会获取该字段的参数详情。为空时，返回全部参数。
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set 参数名称，传入该值，则只会获取该字段的参数详情。为空时，返回全部参数。
     * @param ParamName 参数名称，传入该值，则只会获取该字段的参数详情。为空时，返回全部参数。
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    public DescribeDBInstanceParamTplDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceParamTplDetailRequest(DescribeDBInstanceParamTplDetailRequest source) {
        if (source.TplId != null) {
            this.TplId = new String(source.TplId);
        }
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TplId", this.TplId);
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);

    }
}

