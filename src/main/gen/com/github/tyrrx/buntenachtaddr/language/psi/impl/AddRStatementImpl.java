// This is a generated file. Not intended for manual editing.
package com.github.tyrrx.buntenachtaddr.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.tyrrx.buntenachtaddr.language.psi.AddRTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.tyrrx.buntenachtaddr.language.psi.*;

public class AddRStatementImpl extends ASTWrapperPsiElement implements AddRStatement {

  public AddRStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AddRVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AddRVisitor) accept((AddRVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public AddRValueAssignment getValueAssignment() {
    return findNotNullChildByClass(AddRValueAssignment.class);
  }

}
