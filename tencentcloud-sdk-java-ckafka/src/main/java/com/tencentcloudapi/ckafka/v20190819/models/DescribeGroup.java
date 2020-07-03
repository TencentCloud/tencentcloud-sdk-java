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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGroup extends AbstractModel{

    /**
    * groupId
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * 该 group 使用的协议。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
     * Get groupId 
     * @return Group groupId
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set groupId
     * @param Group groupId
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get 该 group 使用的协议。 
     * @return Protocol 该 group 使用的协议。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 该 group 使用的协议。
     * @param Protocol 该 group 使用的协议。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);

    }
}

