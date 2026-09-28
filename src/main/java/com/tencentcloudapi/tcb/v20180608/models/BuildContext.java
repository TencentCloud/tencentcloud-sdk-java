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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BuildContext extends AbstractModel {

    /**
    * <p>构建路径</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>构建产物输出路径</p>
    */
    @SerializedName("OutPut")
    @Expose
    private String OutPut;

    /**
     * Get <p>构建路径</p> 
     * @return Path <p>构建路径</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>构建路径</p>
     * @param Path <p>构建路径</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>构建产物输出路径</p> 
     * @return OutPut <p>构建产物输出路径</p>
     */
    public String getOutPut() {
        return this.OutPut;
    }

    /**
     * Set <p>构建产物输出路径</p>
     * @param OutPut <p>构建产物输出路径</p>
     */
    public void setOutPut(String OutPut) {
        this.OutPut = OutPut;
    }

    public BuildContext() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BuildContext(BuildContext source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.OutPut != null) {
            this.OutPut = new String(source.OutPut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "OutPut", this.OutPut);

    }
}

