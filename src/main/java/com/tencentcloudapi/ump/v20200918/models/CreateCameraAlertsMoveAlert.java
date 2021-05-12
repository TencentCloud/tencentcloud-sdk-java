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
package com.tencentcloudapi.ump.v20200918.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCameraAlertsMoveAlert extends AbstractModel{

    /**
    * 是否移动
    */
    @SerializedName("Move")
    @Expose
    private Boolean Move;

    /**
    * 是否移动置信度
    */
    @SerializedName("MoveConfidence")
    @Expose
    private Float MoveConfidence;

    /**
     * Get 是否移动 
     * @return Move 是否移动
     */
    public Boolean getMove() {
        return this.Move;
    }

    /**
     * Set 是否移动
     * @param Move 是否移动
     */
    public void setMove(Boolean Move) {
        this.Move = Move;
    }

    /**
     * Get 是否移动置信度 
     * @return MoveConfidence 是否移动置信度
     */
    public Float getMoveConfidence() {
        return this.MoveConfidence;
    }

    /**
     * Set 是否移动置信度
     * @param MoveConfidence 是否移动置信度
     */
    public void setMoveConfidence(Float MoveConfidence) {
        this.MoveConfidence = MoveConfidence;
    }

    public CreateCameraAlertsMoveAlert() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCameraAlertsMoveAlert(CreateCameraAlertsMoveAlert source) {
        if (source.Move != null) {
            this.Move = new Boolean(source.Move);
        }
        if (source.MoveConfidence != null) {
            this.MoveConfidence = new Float(source.MoveConfidence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Move", this.Move);
        this.setParamSimple(map, prefix + "MoveConfidence", this.MoveConfidence);

    }
}

