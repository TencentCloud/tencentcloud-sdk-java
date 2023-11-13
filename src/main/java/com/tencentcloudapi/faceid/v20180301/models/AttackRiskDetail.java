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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttackRiskDetail extends AbstractModel {

    /**
    * 疑似的攻击痕迹类型
SuspectedSpoofingAttack：翻拍攻击
SuspectedSynthesisImage：疑似合成图片
SuspectedSynthesisVideo：疑似合成视频
SuspectedeAnomalyAttack：人脸特征疑似非真人
SuspectedAdversarialAttack：疑似对抗样本攻击
SuspectedBlackIndustry：疑似黑产攻击
SuspectedWatermark：疑似存在水印
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 疑似的攻击痕迹类型
SuspectedSpoofingAttack：翻拍攻击
SuspectedSynthesisImage：疑似合成图片
SuspectedSynthesisVideo：疑似合成视频
SuspectedeAnomalyAttack：人脸特征疑似非真人
SuspectedAdversarialAttack：疑似对抗样本攻击
SuspectedBlackIndustry：疑似黑产攻击
SuspectedWatermark：疑似存在水印
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 疑似的攻击痕迹类型
SuspectedSpoofingAttack：翻拍攻击
SuspectedSynthesisImage：疑似合成图片
SuspectedSynthesisVideo：疑似合成视频
SuspectedeAnomalyAttack：人脸特征疑似非真人
SuspectedAdversarialAttack：疑似对抗样本攻击
SuspectedBlackIndustry：疑似黑产攻击
SuspectedWatermark：疑似存在水印
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 疑似的攻击痕迹类型
SuspectedSpoofingAttack：翻拍攻击
SuspectedSynthesisImage：疑似合成图片
SuspectedSynthesisVideo：疑似合成视频
SuspectedeAnomalyAttack：人脸特征疑似非真人
SuspectedAdversarialAttack：疑似对抗样本攻击
SuspectedBlackIndustry：疑似黑产攻击
SuspectedWatermark：疑似存在水印
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 疑似的攻击痕迹类型
SuspectedSpoofingAttack：翻拍攻击
SuspectedSynthesisImage：疑似合成图片
SuspectedSynthesisVideo：疑似合成视频
SuspectedeAnomalyAttack：人脸特征疑似非真人
SuspectedAdversarialAttack：疑似对抗样本攻击
SuspectedBlackIndustry：疑似黑产攻击
SuspectedWatermark：疑似存在水印
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public AttackRiskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttackRiskDetail(AttackRiskDetail source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

