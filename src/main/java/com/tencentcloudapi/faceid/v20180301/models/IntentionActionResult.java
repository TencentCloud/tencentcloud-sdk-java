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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntentionActionResult extends AbstractModel{

    /**
    * 意愿核身错误码：
0: "成功"       
-1: "参数错误"    
-2: "系统异常"    
-101: "请保持人脸在框内"    
-102: "检测到多张人脸"   
-103: "人脸检测失败"   
-104: "人脸检测不完整"   
-105: "请勿遮挡眼睛"    
-106: "请勿遮挡嘴巴"     
-107: "请勿遮挡鼻子"     
-201: "人脸比对相似度低"    
-202: "人脸比对失败"    
-301: "意愿核验不通过"   
-800: "前端不兼容错误"    
-801: "用户未授权摄像头和麦克风权限"   
-802: "获取视频流失败"   
-803: "用户主动关闭链接/异常断开链接"   
-998: "系统数据异常"   
-999: "系统未知错误，请联系人工核实"   
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinalResultDetailCode")
    @Expose
    private Long FinalResultDetailCode;

    /**
    * 意愿核身错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinalResultMessage")
    @Expose
    private String FinalResultMessage;

    /**
    * 意愿核身结果详细数据，与每段点头确认过程一一对应
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Details")
    @Expose
    private IntentionActionResultDetail [] Details;

    /**
     * Get 意愿核身错误码：
0: "成功"       
-1: "参数错误"    
-2: "系统异常"    
-101: "请保持人脸在框内"    
-102: "检测到多张人脸"   
-103: "人脸检测失败"   
-104: "人脸检测不完整"   
-105: "请勿遮挡眼睛"    
-106: "请勿遮挡嘴巴"     
-107: "请勿遮挡鼻子"     
-201: "人脸比对相似度低"    
-202: "人脸比对失败"    
-301: "意愿核验不通过"   
-800: "前端不兼容错误"    
-801: "用户未授权摄像头和麦克风权限"   
-802: "获取视频流失败"   
-803: "用户主动关闭链接/异常断开链接"   
-998: "系统数据异常"   
-999: "系统未知错误，请联系人工核实"   
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinalResultDetailCode 意愿核身错误码：
0: "成功"       
-1: "参数错误"    
-2: "系统异常"    
-101: "请保持人脸在框内"    
-102: "检测到多张人脸"   
-103: "人脸检测失败"   
-104: "人脸检测不完整"   
-105: "请勿遮挡眼睛"    
-106: "请勿遮挡嘴巴"     
-107: "请勿遮挡鼻子"     
-201: "人脸比对相似度低"    
-202: "人脸比对失败"    
-301: "意愿核验不通过"   
-800: "前端不兼容错误"    
-801: "用户未授权摄像头和麦克风权限"   
-802: "获取视频流失败"   
-803: "用户主动关闭链接/异常断开链接"   
-998: "系统数据异常"   
-999: "系统未知错误，请联系人工核实"   
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFinalResultDetailCode() {
        return this.FinalResultDetailCode;
    }

    /**
     * Set 意愿核身错误码：
0: "成功"       
-1: "参数错误"    
-2: "系统异常"    
-101: "请保持人脸在框内"    
-102: "检测到多张人脸"   
-103: "人脸检测失败"   
-104: "人脸检测不完整"   
-105: "请勿遮挡眼睛"    
-106: "请勿遮挡嘴巴"     
-107: "请勿遮挡鼻子"     
-201: "人脸比对相似度低"    
-202: "人脸比对失败"    
-301: "意愿核验不通过"   
-800: "前端不兼容错误"    
-801: "用户未授权摄像头和麦克风权限"   
-802: "获取视频流失败"   
-803: "用户主动关闭链接/异常断开链接"   
-998: "系统数据异常"   
-999: "系统未知错误，请联系人工核实"   
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinalResultDetailCode 意愿核身错误码：
0: "成功"       
-1: "参数错误"    
-2: "系统异常"    
-101: "请保持人脸在框内"    
-102: "检测到多张人脸"   
-103: "人脸检测失败"   
-104: "人脸检测不完整"   
-105: "请勿遮挡眼睛"    
-106: "请勿遮挡嘴巴"     
-107: "请勿遮挡鼻子"     
-201: "人脸比对相似度低"    
-202: "人脸比对失败"    
-301: "意愿核验不通过"   
-800: "前端不兼容错误"    
-801: "用户未授权摄像头和麦克风权限"   
-802: "获取视频流失败"   
-803: "用户主动关闭链接/异常断开链接"   
-998: "系统数据异常"   
-999: "系统未知错误，请联系人工核实"   
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinalResultDetailCode(Long FinalResultDetailCode) {
        this.FinalResultDetailCode = FinalResultDetailCode;
    }

    /**
     * Get 意愿核身错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinalResultMessage 意愿核身错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFinalResultMessage() {
        return this.FinalResultMessage;
    }

    /**
     * Set 意愿核身错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinalResultMessage 意愿核身错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinalResultMessage(String FinalResultMessage) {
        this.FinalResultMessage = FinalResultMessage;
    }

    /**
     * Get 意愿核身结果详细数据，与每段点头确认过程一一对应
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Details 意愿核身结果详细数据，与每段点头确认过程一一对应
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntentionActionResultDetail [] getDetails() {
        return this.Details;
    }

    /**
     * Set 意愿核身结果详细数据，与每段点头确认过程一一对应
注意：此字段可能返回 null，表示取不到有效值。
     * @param Details 意愿核身结果详细数据，与每段点头确认过程一一对应
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetails(IntentionActionResultDetail [] Details) {
        this.Details = Details;
    }

    public IntentionActionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntentionActionResult(IntentionActionResult source) {
        if (source.FinalResultDetailCode != null) {
            this.FinalResultDetailCode = new Long(source.FinalResultDetailCode);
        }
        if (source.FinalResultMessage != null) {
            this.FinalResultMessage = new String(source.FinalResultMessage);
        }
        if (source.Details != null) {
            this.Details = new IntentionActionResultDetail[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new IntentionActionResultDetail(source.Details[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FinalResultDetailCode", this.FinalResultDetailCode);
        this.setParamSimple(map, prefix + "FinalResultMessage", this.FinalResultMessage);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);

    }
}

