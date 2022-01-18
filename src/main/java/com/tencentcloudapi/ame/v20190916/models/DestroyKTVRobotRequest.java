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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DestroyKTVRobotRequest extends AbstractModel{

    /**
    * 机器人Id。
    */
    @SerializedName("RobotId")
    @Expose
    private String RobotId;

    /**
     * Get 机器人Id。 
     * @return RobotId 机器人Id。
     */
    public String getRobotId() {
        return this.RobotId;
    }

    /**
     * Set 机器人Id。
     * @param RobotId 机器人Id。
     */
    public void setRobotId(String RobotId) {
        this.RobotId = RobotId;
    }

    public DestroyKTVRobotRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DestroyKTVRobotRequest(DestroyKTVRobotRequest source) {
        if (source.RobotId != null) {
            this.RobotId = new String(source.RobotId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RobotId", this.RobotId);

    }
}

