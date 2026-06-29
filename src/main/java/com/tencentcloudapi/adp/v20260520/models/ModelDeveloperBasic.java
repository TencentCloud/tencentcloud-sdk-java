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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelDeveloperBasic extends AbstractModel {

    /**
    * <p>作者标识</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>作者显示名称</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
     * Get <p>作者标识</p> 
     * @return Name <p>作者标识</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>作者标识</p>
     * @param Name <p>作者标识</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>作者显示名称</p> 
     * @return Alias <p>作者显示名称</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>作者显示名称</p>
     * @param Alias <p>作者显示名称</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public ModelDeveloperBasic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelDeveloperBasic(ModelDeveloperBasic source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Alias", this.Alias);

    }
}

