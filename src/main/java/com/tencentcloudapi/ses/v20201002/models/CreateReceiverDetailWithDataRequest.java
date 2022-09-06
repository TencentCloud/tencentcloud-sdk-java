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

public class CreateReceiverDetailWithDataRequest extends AbstractModel{

    /**
    * 收件人列表ID
    */
    @SerializedName("ReceiverId")
    @Expose
    private Long ReceiverId;

    /**
    * 收信人邮箱以及模板参数，数组形式。收件人个数限制20000个以内。
    */
    @SerializedName("Datas")
    @Expose
    private ReceiverInputData [] Datas;

    /**
     * Get 收件人列表ID 
     * @return ReceiverId 收件人列表ID
     */
    public Long getReceiverId() {
        return this.ReceiverId;
    }

    /**
     * Set 收件人列表ID
     * @param ReceiverId 收件人列表ID
     */
    public void setReceiverId(Long ReceiverId) {
        this.ReceiverId = ReceiverId;
    }

    /**
     * Get 收信人邮箱以及模板参数，数组形式。收件人个数限制20000个以内。 
     * @return Datas 收信人邮箱以及模板参数，数组形式。收件人个数限制20000个以内。
     */
    public ReceiverInputData [] getDatas() {
        return this.Datas;
    }

    /**
     * Set 收信人邮箱以及模板参数，数组形式。收件人个数限制20000个以内。
     * @param Datas 收信人邮箱以及模板参数，数组形式。收件人个数限制20000个以内。
     */
    public void setDatas(ReceiverInputData [] Datas) {
        this.Datas = Datas;
    }

    public CreateReceiverDetailWithDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReceiverDetailWithDataRequest(CreateReceiverDetailWithDataRequest source) {
        if (source.ReceiverId != null) {
            this.ReceiverId = new Long(source.ReceiverId);
        }
        if (source.Datas != null) {
            this.Datas = new ReceiverInputData[source.Datas.length];
            for (int i = 0; i < source.Datas.length; i++) {
                this.Datas[i] = new ReceiverInputData(source.Datas[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReceiverId", this.ReceiverId);
        this.setParamArrayObj(map, prefix + "Datas.", this.Datas);

    }
}

