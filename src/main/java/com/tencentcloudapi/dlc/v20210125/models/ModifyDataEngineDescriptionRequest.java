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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDataEngineDescriptionRequest extends AbstractModel {

    /**
    * 要修改的引擎的名称
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * 引擎的描述信息，最大长度为250
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 要修改的引擎的名称 
     * @return DataEngineName 要修改的引擎的名称
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set 要修改的引擎的名称
     * @param DataEngineName 要修改的引擎的名称
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get 引擎的描述信息，最大长度为250 
     * @return Message 引擎的描述信息，最大长度为250
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 引擎的描述信息，最大长度为250
     * @param Message 引擎的描述信息，最大长度为250
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public ModifyDataEngineDescriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDataEngineDescriptionRequest(ModifyDataEngineDescriptionRequest source) {
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

