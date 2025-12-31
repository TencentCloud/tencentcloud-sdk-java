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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InterconnectPair extends AbstractModel {

    /**
    * 集合A
    */
    @SerializedName("GroupA")
    @Expose
    private AccessInstanceInfo [] GroupA;

    /**
    * 集合B
    */
    @SerializedName("GroupB")
    @Expose
    private AccessInstanceInfo [] GroupB;

    /**
    * 互联模式："CrossConnect": 交叉互联（组A内每个实例和组B内每个实例互联），"FullMesh": 全互联（组A实际和组B内容一致，相当于组内两两互联）
    */
    @SerializedName("InterconnectMode")
    @Expose
    private String InterconnectMode;

    /**
     * Get 集合A 
     * @return GroupA 集合A
     */
    public AccessInstanceInfo [] getGroupA() {
        return this.GroupA;
    }

    /**
     * Set 集合A
     * @param GroupA 集合A
     */
    public void setGroupA(AccessInstanceInfo [] GroupA) {
        this.GroupA = GroupA;
    }

    /**
     * Get 集合B 
     * @return GroupB 集合B
     */
    public AccessInstanceInfo [] getGroupB() {
        return this.GroupB;
    }

    /**
     * Set 集合B
     * @param GroupB 集合B
     */
    public void setGroupB(AccessInstanceInfo [] GroupB) {
        this.GroupB = GroupB;
    }

    /**
     * Get 互联模式："CrossConnect": 交叉互联（组A内每个实例和组B内每个实例互联），"FullMesh": 全互联（组A实际和组B内容一致，相当于组内两两互联） 
     * @return InterconnectMode 互联模式："CrossConnect": 交叉互联（组A内每个实例和组B内每个实例互联），"FullMesh": 全互联（组A实际和组B内容一致，相当于组内两两互联）
     */
    public String getInterconnectMode() {
        return this.InterconnectMode;
    }

    /**
     * Set 互联模式："CrossConnect": 交叉互联（组A内每个实例和组B内每个实例互联），"FullMesh": 全互联（组A实际和组B内容一致，相当于组内两两互联）
     * @param InterconnectMode 互联模式："CrossConnect": 交叉互联（组A内每个实例和组B内每个实例互联），"FullMesh": 全互联（组A实际和组B内容一致，相当于组内两两互联）
     */
    public void setInterconnectMode(String InterconnectMode) {
        this.InterconnectMode = InterconnectMode;
    }

    public InterconnectPair() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InterconnectPair(InterconnectPair source) {
        if (source.GroupA != null) {
            this.GroupA = new AccessInstanceInfo[source.GroupA.length];
            for (int i = 0; i < source.GroupA.length; i++) {
                this.GroupA[i] = new AccessInstanceInfo(source.GroupA[i]);
            }
        }
        if (source.GroupB != null) {
            this.GroupB = new AccessInstanceInfo[source.GroupB.length];
            for (int i = 0; i < source.GroupB.length; i++) {
                this.GroupB[i] = new AccessInstanceInfo(source.GroupB[i]);
            }
        }
        if (source.InterconnectMode != null) {
            this.InterconnectMode = new String(source.InterconnectMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "GroupA.", this.GroupA);
        this.setParamArrayObj(map, prefix + "GroupB.", this.GroupB);
        this.setParamSimple(map, prefix + "InterconnectMode", this.InterconnectMode);

    }
}

