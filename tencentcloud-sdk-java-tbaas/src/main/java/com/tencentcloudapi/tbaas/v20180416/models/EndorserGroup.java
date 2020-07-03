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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EndorserGroup extends AbstractModel{

    /**
    * 背书组织名称
    */
    @SerializedName("EndorserGroupName")
    @Expose
    private String EndorserGroupName;

    /**
    * 背书节点列表
    */
    @SerializedName("EndorserPeerList")
    @Expose
    private String [] EndorserPeerList;

    /**
     * Get 背书组织名称 
     * @return EndorserGroupName 背书组织名称
     */
    public String getEndorserGroupName() {
        return this.EndorserGroupName;
    }

    /**
     * Set 背书组织名称
     * @param EndorserGroupName 背书组织名称
     */
    public void setEndorserGroupName(String EndorserGroupName) {
        this.EndorserGroupName = EndorserGroupName;
    }

    /**
     * Get 背书节点列表 
     * @return EndorserPeerList 背书节点列表
     */
    public String [] getEndorserPeerList() {
        return this.EndorserPeerList;
    }

    /**
     * Set 背书节点列表
     * @param EndorserPeerList 背书节点列表
     */
    public void setEndorserPeerList(String [] EndorserPeerList) {
        this.EndorserPeerList = EndorserPeerList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndorserGroupName", this.EndorserGroupName);
        this.setParamArraySimple(map, prefix + "EndorserPeerList.", this.EndorserPeerList);

    }
}

