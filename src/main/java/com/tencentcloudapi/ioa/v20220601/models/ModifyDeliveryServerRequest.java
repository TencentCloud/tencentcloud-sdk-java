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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDeliveryServerRequest extends AbstractModel {

    /**
    * <p>编辑的数据内容</p>
    */
    @SerializedName("Data")
    @Expose
    private DeliverServerItem Data;

    /**
     * Get <p>编辑的数据内容</p> 
     * @return Data <p>编辑的数据内容</p>
     */
    public DeliverServerItem getData() {
        return this.Data;
    }

    /**
     * Set <p>编辑的数据内容</p>
     * @param Data <p>编辑的数据内容</p>
     */
    public void setData(DeliverServerItem Data) {
        this.Data = Data;
    }

    public ModifyDeliveryServerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDeliveryServerRequest(ModifyDeliveryServerRequest source) {
        if (source.Data != null) {
            this.Data = new DeliverServerItem(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Data.", this.Data);

    }
}

