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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CameraControl extends AbstractModel {

    /**
    * 枚举值：“simple”, “down_back”, “forward_up”, “right_turn_forward”, “left_turn_forward”
simple：简单运镜，此类型下可在"config"中六选一进行运镜
down_back：镜头下压并后退 -> 下移拉远，此类型下config参数无需填写
forward_up：镜头前进并上仰 -> 推进上移，此类型下config参数无需填写
right_turn_forward：先右旋转后前进 -> 右旋推进，此类型下config参数无需填写
left_turn_forward：先左旋并前进 -> 左旋推进，此类型下config参数无需填写
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 包含六个字段，用于指定摄像机在不同方向上的运动或变化。
- 当运镜类型指定simple时必填，指定其他类型时不填
- 参数6选1，即只能有一个参数不为0，其余参数为0
    */
    @SerializedName("Config")
    @Expose
    private CameraControlConfig Config;

    /**
     * Get 枚举值：“simple”, “down_back”, “forward_up”, “right_turn_forward”, “left_turn_forward”
simple：简单运镜，此类型下可在"config"中六选一进行运镜
down_back：镜头下压并后退 -> 下移拉远，此类型下config参数无需填写
forward_up：镜头前进并上仰 -> 推进上移，此类型下config参数无需填写
right_turn_forward：先右旋转后前进 -> 右旋推进，此类型下config参数无需填写
left_turn_forward：先左旋并前进 -> 左旋推进，此类型下config参数无需填写 
     * @return Type 枚举值：“simple”, “down_back”, “forward_up”, “right_turn_forward”, “left_turn_forward”
simple：简单运镜，此类型下可在"config"中六选一进行运镜
down_back：镜头下压并后退 -> 下移拉远，此类型下config参数无需填写
forward_up：镜头前进并上仰 -> 推进上移，此类型下config参数无需填写
right_turn_forward：先右旋转后前进 -> 右旋推进，此类型下config参数无需填写
left_turn_forward：先左旋并前进 -> 左旋推进，此类型下config参数无需填写
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 枚举值：“simple”, “down_back”, “forward_up”, “right_turn_forward”, “left_turn_forward”
simple：简单运镜，此类型下可在"config"中六选一进行运镜
down_back：镜头下压并后退 -> 下移拉远，此类型下config参数无需填写
forward_up：镜头前进并上仰 -> 推进上移，此类型下config参数无需填写
right_turn_forward：先右旋转后前进 -> 右旋推进，此类型下config参数无需填写
left_turn_forward：先左旋并前进 -> 左旋推进，此类型下config参数无需填写
     * @param Type 枚举值：“simple”, “down_back”, “forward_up”, “right_turn_forward”, “left_turn_forward”
simple：简单运镜，此类型下可在"config"中六选一进行运镜
down_back：镜头下压并后退 -> 下移拉远，此类型下config参数无需填写
forward_up：镜头前进并上仰 -> 推进上移，此类型下config参数无需填写
right_turn_forward：先右旋转后前进 -> 右旋推进，此类型下config参数无需填写
left_turn_forward：先左旋并前进 -> 左旋推进，此类型下config参数无需填写
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 包含六个字段，用于指定摄像机在不同方向上的运动或变化。
- 当运镜类型指定simple时必填，指定其他类型时不填
- 参数6选1，即只能有一个参数不为0，其余参数为0 
     * @return Config 包含六个字段，用于指定摄像机在不同方向上的运动或变化。
- 当运镜类型指定simple时必填，指定其他类型时不填
- 参数6选1，即只能有一个参数不为0，其余参数为0
     */
    public CameraControlConfig getConfig() {
        return this.Config;
    }

    /**
     * Set 包含六个字段，用于指定摄像机在不同方向上的运动或变化。
- 当运镜类型指定simple时必填，指定其他类型时不填
- 参数6选1，即只能有一个参数不为0，其余参数为0
     * @param Config 包含六个字段，用于指定摄像机在不同方向上的运动或变化。
- 当运镜类型指定simple时必填，指定其他类型时不填
- 参数6选1，即只能有一个参数不为0，其余参数为0
     */
    public void setConfig(CameraControlConfig Config) {
        this.Config = Config;
    }

    public CameraControl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CameraControl(CameraControl source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Config != null) {
            this.Config = new CameraControlConfig(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Config.", this.Config);

    }
}

