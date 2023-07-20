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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BooleanResponse extends AbstractModel{

    /**
    * 是否成功
    */
    @SerializedName("Success")
    @Expose
    private Boolean Success;

    /**
    * 失败返回提示信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 是否成功 
     * @return Success 是否成功
     */
    public Boolean getSuccess() {
        return this.Success;
    }

    /**
     * Set 是否成功
     * @param Success 是否成功
     */
    public void setSuccess(Boolean Success) {
        this.Success = Success;
    }

    /**
     * Get 失败返回提示信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 失败返回提示信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 失败返回提示信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 失败返回提示信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public BooleanResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BooleanResponse(BooleanResponse source) {
        if (source.Success != null) {
            this.Success = new Boolean(source.Success);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Success", this.Success);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

