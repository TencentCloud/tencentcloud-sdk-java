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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityPolicyDatabase extends AbstractModel{

    /**
    * 本端网段
    */
    @SerializedName("LocalCidrBlock")
    @Expose
    private String LocalCidrBlock;

    /**
    * 对端网段
    */
    @SerializedName("RemoteCidrBlock")
    @Expose
    private String [] RemoteCidrBlock;

    /**
     * Get 本端网段 
     * @return LocalCidrBlock 本端网段
     */
    public String getLocalCidrBlock() {
        return this.LocalCidrBlock;
    }

    /**
     * Set 本端网段
     * @param LocalCidrBlock 本端网段
     */
    public void setLocalCidrBlock(String LocalCidrBlock) {
        this.LocalCidrBlock = LocalCidrBlock;
    }

    /**
     * Get 对端网段 
     * @return RemoteCidrBlock 对端网段
     */
    public String [] getRemoteCidrBlock() {
        return this.RemoteCidrBlock;
    }

    /**
     * Set 对端网段
     * @param RemoteCidrBlock 对端网段
     */
    public void setRemoteCidrBlock(String [] RemoteCidrBlock) {
        this.RemoteCidrBlock = RemoteCidrBlock;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalCidrBlock", this.LocalCidrBlock);
        this.setParamArraySimple(map, prefix + "RemoteCidrBlock.", this.RemoteCidrBlock);

    }
}

