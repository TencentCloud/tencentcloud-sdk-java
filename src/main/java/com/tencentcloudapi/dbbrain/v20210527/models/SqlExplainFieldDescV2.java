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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SqlExplainFieldDescV2 extends AbstractModel {

    /**
    * <p>字段英文名，与 Explain / VisualExplain 中出现的字段一致，例如 access_type、key、rows。</p>
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * <p>字段中文释义。</p>
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get <p>字段英文名，与 Explain / VisualExplain 中出现的字段一致，例如 access_type、key、rows。</p> 
     * @return Field <p>字段英文名，与 Explain / VisualExplain 中出现的字段一致，例如 access_type、key、rows。</p>
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set <p>字段英文名，与 Explain / VisualExplain 中出现的字段一致，例如 access_type、key、rows。</p>
     * @param Field <p>字段英文名，与 Explain / VisualExplain 中出现的字段一致，例如 access_type、key、rows。</p>
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get <p>字段中文释义。</p> 
     * @return Desc <p>字段中文释义。</p>
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set <p>字段中文释义。</p>
     * @param Desc <p>字段中文释义。</p>
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public SqlExplainFieldDescV2() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SqlExplainFieldDescV2(SqlExplainFieldDescV2 source) {
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

