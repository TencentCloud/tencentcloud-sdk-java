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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLiveAvatarRoomRequest extends AbstractModel {

    /**
    * 直播间名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 操作者。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 直播间名称。 
     * @return Name 直播间名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 直播间名称。
     * @param Name 直播间名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 操作者。 
     * @return Operator 操作者。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。
     * @param Operator 操作者。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public CreateLiveAvatarRoomRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLiveAvatarRoomRequest(CreateLiveAvatarRoomRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

