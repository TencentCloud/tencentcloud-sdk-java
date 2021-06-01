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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallBackInfo extends AbstractModel{

    /**
    * 回调时的Body
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
    * 回调时的Headers
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Headers")
    @Expose
    private String [] Headers;

    /**
     * Get 回调时的Body 
     * @return Body 回调时的Body
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set 回调时的Body
     * @param Body 回调时的Body
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Get 回调时的Headers
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Headers 回调时的Headers
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set 回调时的Headers
注意：此字段可能返回 null，表示取不到有效值。
     * @param Headers 回调时的Headers
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaders(String [] Headers) {
        this.Headers = Headers;
    }

    public CallBackInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallBackInfo(CallBackInfo source) {
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
        if (source.Headers != null) {
            this.Headers = new String[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new String(source.Headers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Body", this.Body);
        this.setParamArraySimple(map, prefix + "Headers.", this.Headers);

    }
}

