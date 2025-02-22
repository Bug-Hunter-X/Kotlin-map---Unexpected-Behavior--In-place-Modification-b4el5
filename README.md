# Kotlin map() Unexpected Behavior: In-place Modification

This example demonstrates a common misconception regarding Kotlin's `map()` function. Many developers assume that `map()` modifies the original list, but this is incorrect. `map()` creates a *new* list containing the transformed elements, leaving the original list untouched.

The `bug.kt` file contains code that exemplifies this issue.  The solution, shown in `bugSolution.kt`, explains how to correctly use `map()` and handle the returned list.