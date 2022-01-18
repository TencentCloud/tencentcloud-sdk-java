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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateReceiverRequest extends AbstractModel{

    /**
    * 收件人列表名称
    */
    @SerializedName("ReceiversName")
    @Expose
    private String ReceiversName;

    /**
    * 收件人列表描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get 收件人列表名称 
     * @return ReceiversName 收件人列表名称
     */
    public String getReceiversName() {
        return this.ReceiversName;
    }

    /**
     * Set 收件人列表名称
     * @param ReceiversName 收件人列表名称
     */
    public void setReceiversName(String ReceiversName) {
        this.ReceiversName = ReceiversName;
    }

    /**
     * Get 收件人列表描述 
     * @return Desc 收件人列表描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 收件人列表描述
     * @param Desc 收件人列表描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public CreateReceiverRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReceiverRequest(CreateReceiverRequest source) {
        if (source.ReceiversName != null) {
            this.ReceiversName = new String(source.ReceiversName);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReceiversName", this.ReceiversName);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

