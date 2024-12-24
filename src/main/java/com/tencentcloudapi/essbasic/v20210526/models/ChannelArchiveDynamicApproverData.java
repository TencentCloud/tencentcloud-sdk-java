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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelArchiveDynamicApproverData extends AbstractModel {

    /**
    * 签署方唯一编号，一个全局唯一的标识符，不同的流程不会出现冲突。 可以使用签署方的唯一编号来生成签署链接（也可以通过RecipientId来生成签署链接）。	
    */
    @SerializedName("SignId")
    @Expose
    private String SignId;

    /**
    * 签署方角色编号，签署方角色编号是用于区分同一个流程中不同签署方的唯一标识。不同的流程会出现同样的签署方角色编号。 填写控件和签署控件都与特定的角色编号关联。	
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
     * Get 签署方唯一编号，一个全局唯一的标识符，不同的流程不会出现冲突。 可以使用签署方的唯一编号来生成签署链接（也可以通过RecipientId来生成签署链接）。	 
     * @return SignId 签署方唯一编号，一个全局唯一的标识符，不同的流程不会出现冲突。 可以使用签署方的唯一编号来生成签署链接（也可以通过RecipientId来生成签署链接）。	
     */
    public String getSignId() {
        return this.SignId;
    }

    /**
     * Set 签署方唯一编号，一个全局唯一的标识符，不同的流程不会出现冲突。 可以使用签署方的唯一编号来生成签署链接（也可以通过RecipientId来生成签署链接）。	
     * @param SignId 签署方唯一编号，一个全局唯一的标识符，不同的流程不会出现冲突。 可以使用签署方的唯一编号来生成签署链接（也可以通过RecipientId来生成签署链接）。	
     */
    public void setSignId(String SignId) {
        this.SignId = SignId;
    }

    /**
     * Get 签署方角色编号，签署方角色编号是用于区分同一个流程中不同签署方的唯一标识。不同的流程会出现同样的签署方角色编号。 填写控件和签署控件都与特定的角色编号关联。	 
     * @return RecipientId 签署方角色编号，签署方角色编号是用于区分同一个流程中不同签署方的唯一标识。不同的流程会出现同样的签署方角色编号。 填写控件和签署控件都与特定的角色编号关联。	
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 签署方角色编号，签署方角色编号是用于区分同一个流程中不同签署方的唯一标识。不同的流程会出现同样的签署方角色编号。 填写控件和签署控件都与特定的角色编号关联。	
     * @param RecipientId 签署方角色编号，签署方角色编号是用于区分同一个流程中不同签署方的唯一标识。不同的流程会出现同样的签署方角色编号。 填写控件和签署控件都与特定的角色编号关联。	
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    public ChannelArchiveDynamicApproverData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelArchiveDynamicApproverData(ChannelArchiveDynamicApproverData source) {
        if (source.SignId != null) {
            this.SignId = new String(source.SignId);
        }
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SignId", this.SignId);
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);

    }
}

